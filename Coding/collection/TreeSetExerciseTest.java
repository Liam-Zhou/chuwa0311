package com.chuwa.exercise.collection;

import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:46 PM
 */
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
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertTrue(set.contains(2));
        assertEquals(1, set.first());
        assertEquals(6, set.last());
        assertEquals(6, set.size());
        System.out.println(set.subSet(2, 5));
        System.out.println(set.headSet(2));
        System.out.println(set.tailSet(2));
    }
}
