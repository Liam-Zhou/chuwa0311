package com.chuwa.exercise.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

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
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        assertEquals(2, array.get(1));
        assertEquals(3, array.size());
        array.addAll(Arrays.asList(4, 5, 6));
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
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(1, 2, 3, 4));
        array.remove(0);
        array.removeAll(Arrays.asList(3, 4));
        array.replaceAll(e -> e * e);
        array.set(1, 9);
        array.clear();

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
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Iterator<Integer> iter = array.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        Iterator<Integer> iter1 = array.iterator();

        while (iter1.hasNext()) {
            if (iter1.next() % 2 != 0) {
                iter1.remove();
            }
        }

        Iterator<Integer> iter2 = array.iterator();
        iter2.forEachRemaining(x -> System.out.println(x));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.addAll(Arrays.asList(4, 3, 6, 9, 10, 1, 5));
        Collections.sort(array);
        Collections.sort(array, Comparator.reverseOrder());
    }
}
