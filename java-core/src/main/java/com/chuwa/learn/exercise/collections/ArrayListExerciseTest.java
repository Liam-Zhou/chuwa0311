package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

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
        array.add(3);
        array.add(4);
        array.add(5);
        assertEquals(4, array.get(1));;
        assertEquals(3, array.size());
        array.addAll(Arrays.asList(8, 9, 10));
        assertEquals(9, array.get(4));;
        assertEquals(6, array.size());
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
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 10, 10, 12, 17, 20, 30, 35, 100));
        array.remove(Integer.valueOf(0));
        array.remove(0);
        assertFalse(array.contains(0));
        assertFalse(array.contains(1));
        array.removeAll(Arrays.asList(20, 35, 100));
        System.out.println(array);
        array.replaceAll(x -> 2*x);
        System.out.println(array);
        array.set(2, 2000);
        System.out.println(array);
        System.out.println(array.indexOf(20));
        System.out.println(array.lastIndexOf(20));
        array.clear();
        System.out.println(array);
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
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 10, 10, 12, 17, 20, 30, 35, 100));
        Iterator<Integer> iter = array.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        Iterator<Integer> iter2 = array.iterator();
        while (iter2.hasNext()) {
            if (iter2.next() % 2 == 0) {
                iter2.remove();
            }
        }
        System.out.println("\n" + array);
        Iterator<Integer> iter3 = array.iterator();
        iter3.forEachRemaining(x -> System.out.println(x));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.addAll(Arrays.asList(5, 3, 15, 23, 55, 12, 14, 21, 45 ,66, 35, 33, 39));
        array.sort((a, b) -> b - a);
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array, Comparator.reverseOrder());
        System.out.println(array);

    }

}
