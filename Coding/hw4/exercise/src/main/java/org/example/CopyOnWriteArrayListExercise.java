package org.example;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertEquals;

public class CopyOnWriteArrayListExercise {
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
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // Test inserting elements
        list.add(5); // Add element at the end of the list
        list.add(0, 2); // Add element at index 0
        list.addAll(List.of(4, 6, 8)); // Add multiple elements at the end of the list

        // [2, 5, 4, 6, 8]
        // Test addIfAbsent method
        list.addIfAbsent(5); // Element 5 already exists, so it won't be added
        list.addIfAbsent(7); // Element 7 does not exist, so it will be added

        // [2, 5, 4, 6, 8, 7]
        // Test addAllAbsent method
        list.addAllAbsent(List.of(8, 9, 10)); // Elements 8 already exists, so it won't be added
        // Elements 9 and 10 do not exist, so they will be added
        // [2, 5, 4, 6, 8, 7, 9, 10]
        // Verify that elements are inserted correctly
        assertEquals(Integer.valueOf(2), list.get(0)); // First element should be 2
        assertEquals(Integer.valueOf(5), list.get(1)); // Second element should be 5
        assertEquals(Integer.valueOf(4), list.get(2)); // Third element should be 4

        // Verify that duplicate elements are not added
        assertEquals(8, list.size()); // Expecting the size to be 7 after insertion

        // Print the elements of the list
        System.out.println("Elements of the list:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
