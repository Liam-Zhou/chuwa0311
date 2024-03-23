package org.example;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TreeSetExercise {
    /**
     * e.g.
     * Set<Integer> set= new TreeSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * contains(Object o)
     *
     * first()
     * last()
     * subSet(E fromElement, E toElement)
     * headSet(E toElement)
     * tailSet(E fromElement)
     *
     * remove(Object o)
     *
     * size()
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        TreeSet<Integer> set = new TreeSet<>();

        // Test inserting elements
        set.add(3);
        set.add(1);
        set.add(2);

        // Test retrieving elements
        assertEquals(1, set.first()); // Retrieve the first (lowest) element in the set
        assertEquals(3, set.last()); // Retrieve the last (highest) element in the set
        assertTrue(set.contains(2)); // Check if the set contains element 2

        // Test subset, headSet, and tailSet
        Set<Integer> subSet = set.subSet(1, 3); // Subset containing elements from 1 (inclusive) to 3 (exclusive)
        assertEquals(Set.of(1, 2), subSet); // Check the subset elements

        Set<Integer> headSet = set.headSet(2); // Subset containing elements less than 2
        assertEquals(Set.of(1), headSet); // Check the headSet elements

        Set<Integer> tailSet = set.tailSet(2); // Subset containing elements greater than or equal to 2
        assertEquals(Set.of(2, 3), tailSet); // Check the tailSet elements

        // Test removing elements
        set.remove(2); // Remove element 2 from the set
        assertFalse(set.contains(2)); // Check if the set still contains element 2

        // Test size and isEmpty
        assertEquals(2, set.size()); // Check the size of the set
        assertFalse(set.isEmpty()); // Check if the set is empty
    }
}
