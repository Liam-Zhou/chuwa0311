package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.*;
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
        TreeSet<Integer> set= new TreeSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 7, 8));
        assertTrue(set.contains(2));
        assertEquals(1, set.first());
        assertEquals(8, set.last());
        assertEquals(8, set.size());
        System.out.println(set);
        // subsets are not indexes, are actual elements
        System.out.println(set.subSet(2, 6));
        System.out.println(set.headSet(4));
        System.out.println(set.tailSet(4));

    }
}
