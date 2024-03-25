package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class LinkedListExerciseTest {
    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<Integer> list = new LinkedList<>();

        // Inserting:
        list.add(10); // Adds to the end of the list
        list.addFirst(5); // Adds to the beginning of the list
        list.add(1, 7); // Adds at index 1
        list.addAll(Arrays.asList(12, 14)); // Adds collection at the end
        list.addAll(2, Arrays.asList(8, 9)); // Adds collection starting from index 2

        // Retrieving:
        assertEquals(Integer.valueOf(5), list.getFirst());
        assertEquals(Integer.valueOf(14), list.getLast());
        assertEquals(Integer.valueOf(7), list.get(1));
        assertEquals(Arrays.asList(5, 7, 8, 9, 10, 12, 14), list);
    }

    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */

    @Test
    public void learn_Remove_Sort() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 7, 9, 2, 7, 3));

        // Removing elements:
        list.removeFirst(); // Removes the first element (3)
        list.removeLast(); // Removes the last element (3)
        //Integer.valueOf(7) 是为了确保调用的是 remove(Object o) 方法，从而确保是基于值（而非索引）来移除元素
        list.remove(Integer.valueOf(7)); // Removes the first occurrence of 7
        list.remove(1); // Removes the element at index 1 (9)
        list.addLast(7); // Add 7 at the end for testing removeLastOccurrence
        list.removeLastOccurrence(Integer.valueOf(7)); // Removes the last occurrence of 7

        // Sorting:
        Collections.sort(list); // Sorts the list in ascending order
        assertEquals(Arrays.asList(7, 9), list);
    }
}
