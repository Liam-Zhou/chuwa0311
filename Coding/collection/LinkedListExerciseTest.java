package com.chuwa.exercise.collection;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:45 PM
 */
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
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(0, 5);
        list.addAll(Arrays.asList(6,7));
        list.addAll(2, Arrays.asList(9, 10));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
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
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 5));
        list.removeFirst();
        list.removeLast();
        list.remove(Integer.valueOf(1));
        list.remove(3);
        list.removeLastOccurrence(Integer.valueOf(5));
    }
}
