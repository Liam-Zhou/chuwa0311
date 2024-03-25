package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TreeSet;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;

public class TreeSetExerciseTest {
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
        Set<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(5);
        assertTrue(set.contains(10));
        assertTrue(set.contains(20));
        assertTrue(set.contains(5));

        // AddAll - adding multiple elements
        set.addAll(Arrays.asList(30, 40, 50));
        assertTrue(set.size() == 6); // Check if all elements are added

        // Contains - checking if the elements are in the set
        assertTrue(set.contains(30));
        assertTrue(set.contains(40));

        // First and Last - getting the smallest and largest elements
        assertEquals(Integer.valueOf(5), ((TreeSet<Integer>) set).first());
        assertEquals(Integer.valueOf(50), ((TreeSet<Integer>) set).last());

        // SubSet, HeadSet, and TailSet
        Set<Integer> subSet = ((TreeSet<Integer>) set).subSet(10, 40); // Elements range from 10 (inclusive) to 40 (exclusive)
        Set<Integer> headSet = ((TreeSet<Integer>) set).headSet(20); // Elements less than 20
        Set<Integer> tailSet = ((TreeSet<Integer>) set).tailSet(30); // Elements greater than or equal to 30
        assertEquals(Arrays.asList(10, 20, 30), new ArrayList<>(subSet));
        assertEquals(Arrays.asList(5, 10), new ArrayList<>(headSet));
        assertEquals(Arrays.asList(30, 40, 50), new ArrayList<>(tailSet));

        // Remove - removing specific elements
        set.remove(20);
        assertFalse(set.contains(20)); // Now the set should not contain 20

        // Size and IsEmpty - checking the size and if the set is empty
        assertEquals(5, set.size());
        set.clear(); // Clearing all elements
        assertTrue(set.isEmpty()); // Now the set should be empty

    }

}
