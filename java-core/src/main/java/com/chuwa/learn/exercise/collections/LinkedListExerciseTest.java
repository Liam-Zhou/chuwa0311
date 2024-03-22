package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 10);
        System.out.println(list);
        list.addAll(Arrays.asList(4,5, 6));
        System.out.println(list);
        list.addAll(2, Arrays.asList(100, 1000, 1001));
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(5));

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
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6,6, 6, 6, 7, 8, 9, 10));
        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(5));
        list.remove(4);
        list.removeLastOccurrence(Integer.valueOf(6));
        System.out.println(list);

    }
}
