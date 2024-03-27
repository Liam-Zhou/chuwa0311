package com.chuwa.exercise.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
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
        Set<Integer> set = new TreeSet<>();

        set.add(3);
        set.addAll(Set.of(1, 4, 2));

        assertTrue(set.contains(3));

        assertEquals(Integer.valueOf(1), ((TreeSet<Integer>) set).first());
        assertEquals(Integer.valueOf(4), ((TreeSet<Integer>) set).last());

        assertEquals(Set.of(1, 2), ((TreeSet<Integer>) set).subSet(1, 3));
        assertEquals(Set.of(1, 2), ((TreeSet<Integer>) set).headSet(3));
        assertEquals(Set.of(3, 4), ((TreeSet<Integer>) set).tailSet(3));

        set.remove(4);
        assertEquals(3, set.size());

        assertFalse(set.isEmpty());
    }
}
