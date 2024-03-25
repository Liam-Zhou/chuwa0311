package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        // Initialize the HashSet
        Set<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        assertTrue(set.contains(10));
        assertTrue(set.contains(20));

        // AddAll - adding multiple elements
        set.addAll(Arrays.asList(30, 40, 50));
        assertTrue(set.size() == 5); // Check if all elements are added

        // Contains - checking if the elements are in the set
        assertTrue(set.contains(30));
        assertTrue(set.contains(40));

        // Remove - removing specific elements
        set.remove(20);
        assertFalse(set.contains(20)); // Now the set should not contain 20

        // Clear - removing all elements
        set.clear();
        assertTrue(set.isEmpty()); // Now the set should be empty

        // IsEmpty - checking if the set is empty after clearing
        assertTrue(set.isEmpty());
    }
}
