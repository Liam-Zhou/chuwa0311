package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;
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
        HashSet<Integer> set= new HashSet<>();
        assertTrue(set.isEmpty());
        set.add(4);
        set.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(set);
        assertFalse(set.contains(10));
        set.remove(5);
        System.out.println(set);
        set.clear();
        assertTrue(set.isEmpty());
    }
}
