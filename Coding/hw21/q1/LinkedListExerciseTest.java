package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
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
        List<Integer> list = new LinkedList<>();
        // Inserting
        list.add(1); // Adds to the end
        list.add(2); // Adds to the end, equivalent to addLast()
        list.addAll(Arrays.asList(3, 4)); // Adds to the end
        list.add(2, 2); // Adds at index 2
        list.addAll(5, Arrays.asList(5, 6)); // Adds starting at index 5

        // Retrieving
        assertEquals(Integer.valueOf(2), list.get(2));
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
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 2, 1, 4, 3, 5));
        // Remove
        list.removeFirst(); // Removes 3
        list.removeLast(); // Removes 5
        list.remove(Integer.valueOf(3)); // Removes the first occurrence of 3
        list.remove(1); // Removes the element at index 1 (previously 1)
        // Now list is [2, 4]

        // Sort
        Collections.sort(list);
        assertEquals(Arrays.asList(2, 4), list);
    }
}
