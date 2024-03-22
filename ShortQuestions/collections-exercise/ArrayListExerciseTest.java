package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(0);
        list.size();
        list.addAll(Arrays.asList(2, 3, 4));
        for (int i : list) {
            System.out.println(i);
        }
    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        list.set(1, 100);
        list.replaceAll(x -> 2 * x);
        list.contains(6);
        list.indexOf(100);
        list.add(3);
        list.lastIndexOf(3);
    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Iterator<Integer> iter2 = list.iterator();
        while (iter2.hasNext()) {
            if (iter2.next() % 2 == 0) {
                iter2.remove();
            }
        }

        for (int i : list) {
            System.out.println(i);
        }

    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 6, 5, 4, 3, 2));
        Collections.sort(list);
        for (int i : list) {
            System.out.println(i);
        }

        Collections.sort(list, Comparator.reverseOrder());
        for (int i : list) {
            System.out.println(i);
        }
    }
}
