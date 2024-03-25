package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *  CopyOnWriteArrayList是一个线程安全的 ArrayList 变体，
 *  用于在多线程环境中避免并发修改异常。
 *  它在每次修改时复制其内部数组，确保迭代器在迭代时不会遇到由其他线程所做的修改，从而实现线程安全。
 *  但这也意味着它在写操作时（如添加或删除元素）会比标准的 ArrayList 慢。
 */
public class CopyOnWriteArrayListExerciseTest {
    /**tr
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        // Initialization
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add(1, "Banana"); // Adding at specific index
        list.addAll(Arrays.asList("Cherry", "Date"));
        list.addIfAbsent("Elderberry"); // Adds only if the list does not contain the element
        //addAllAbsent 方法向 CopyOnWriteArrayList 中添加一个元素集合，
        //但其中一部分元素已经存在于列表中，那么这个方法只会添加那些不存在于当前列表中的元素。
        // 已经存在的元素不会被重复添加。
        list.addAllAbsent(Arrays.asList("Fig", "Grape", "Apple")); // Adds all elements that are absent
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();

        list.add("Pineapple");

        // Check using the iterator
        StringBuilder fruits = new StringBuilder();
        while (itr.hasNext()) {
            // Here, the iterator doesn't see "Pineapple" because CopyOnWriteArrayList creates a snapshot iterator.
            fruits.append(itr.next());
            // Note: Removing elements via the iterator of a CopyOnWriteArrayList will throw an UnsupportedOperationException.
        }

        // Validate that the iterator contains the initial elements but not the new one added after the iterator was created
        assertEquals("AppleBananaOrange", fruits.toString());

        // Validate that the list contains the new element
        assertTrue(list.contains("Pineapple"));
    }
}

