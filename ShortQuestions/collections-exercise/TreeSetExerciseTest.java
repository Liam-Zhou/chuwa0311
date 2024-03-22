package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

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
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(9);
        set.add(6);
        set.add(3);
        set.add(5);

        System.out.println(set.first());
        System.out.println(set.last());
        Set<Integer> set2 = set.headSet(6);
        System.out.println("set2: ");
        for (int i : set2) {
            System.out.println(i);
        }

        Set<Integer> set3 = set.tailSet(3);
        System.out.println("set3: ");
        for (int i : set3) {
            System.out.println(i);
        }
    }
}
