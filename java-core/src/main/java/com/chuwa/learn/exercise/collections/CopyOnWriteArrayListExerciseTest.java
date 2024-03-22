package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExerciseTest {
    /**
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
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(0, 10);
        System.out.println(list);
        list.addAllAbsent(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

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
        list.add("pear");
        // arraylist can't add element after iterator created
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
