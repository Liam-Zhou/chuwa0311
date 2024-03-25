package com.chuwa.learn.collections;

import org.junit.Test;
import java.util.function.UnaryOperator;
import static org.junit.Assert.*;

import java.util.*;

public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        //new ArrayList()
        List<Integer> list = new ArrayList<>();
        //add elements
        list.add(1);
        list.add(2);
        //get element
        System.out.println(list.get(0));
        //get Size
        System.out.println(list.size());
        //list.addAll(anotherList)
        List<Integer> list1 = Arrays.asList(3, 4, 5); //[1, 2, 3, 4, 5]
        list.addAll(list1);
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));

        // remove() by index and by object
        list.remove(2); // Removes "Cherry"
        list.remove("Banana");

        // removeRange() is protected in ArrayList, so we won't use it directly here
        // Instead, we use subList() combined with clear() for similar functionality
        // 索引2不包含
        list.subList(1, 2).clear(); // Similar to removing range (only applicable within ArrayList subclass)

        // removeAll()
        list.removeAll(Arrays.asList("Apple", "Elderberry")); // This should clear the list

        // clear()
        list.clear();
        assertTrue(list.isEmpty());

        // Update: set()
        list.addAll(Arrays.asList("Fig", "Grape", "Honeydew"));
        list.set(1, "Grapefruit"); // Replace "Grape" with "Grapefruit"

        // Update: replaceAll()
        UnaryOperator<String> operator = str -> str.toUpperCase();
        list.replaceAll(operator); // Convert all items to uppercase

        // check: contains(), indexOf(), lastIndexOf()
        assertTrue(list.contains("HONEYDEW"));
        assertEquals(2, list.indexOf("HONEYDEW"));
        //用于返回列表中指定元素的最后一次出现的索引位置。如果列表不包含此元素，则返回 -1。
        assertEquals(2, list.lastIndexOf("HONEYDEW"));
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Rust", "JavaScript"));

        // iterator()
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            if (language.equals("C")) {
                iterator.remove(); // remove "C" from the list
            }
        }

        assertFalse(list.contains("C"));

        // forEachRemaining()
        iterator = list.iterator(); // Reset iterator
        StringBuilder sb = new StringBuilder();
        iterator.forEachRemaining(sb::append);
        assertTrue(sb.toString().contains("JavaPythonRustJavaScript"));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 2, 4));

        // sort() with natural ordering
        list.sort(null);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), list);

        // Collections.sort()
        Collections.sort(list, Collections.reverseOrder()); // Sorts in descending order
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);

        // Using Comparator.reverseOrder() directly with sort
        list.sort(Comparator.reverseOrder()); // Another way to sort in descending order
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);

    }
}
