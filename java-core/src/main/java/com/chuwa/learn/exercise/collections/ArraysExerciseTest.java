package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArraysExerciseTest {
    /**
     * e.g.
     * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     * numbers[?]
     *
     * numbers[?] = #
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numbers[5]);

    }

    /**
     * binarySearch()
     * e.g.
     * Arrays.binarySearch(numbers, 4);
     *
     * sort(array)
     * sort(array, fromIndex, toIndex)
     * e.g.
     * Arrays.sort(numbers);
     *
     * Arrays.parallelSort(numbers);
     */
    @Test
    public void learn_search_and_sort() {
        int[] numbers = { 5, 3, 15, 23, 55, 12, 14, 21, 45 ,66, 35, 33, 39 };
        Arrays.sort(numbers, 2, 10);
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
        System.out.println();

        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(Arrays.binarySearch(numbers, 12));

        int[] numbers2 = { 5, 3, 15, 23, 55, 12, 14, 21, 45 ,66, 35, 33, 39 };
        Arrays.parallelSort(numbers2);
        Arrays.stream(numbers2).forEach(x -> System.out.print(x + " "));

    }

    /**
     * copyOf()
     * e.g.
     * Arrays.copyOf(numbers, numbers.length);
     *
     * copyOfRange()
     * e.g.
     * Arrays.copyOfRange(numbers, 0, 5);
     */
    @Test
    public void learn_copy_of_array() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] numbers2 = Arrays.copyOf(numbers, 3);
        Arrays.stream(numbers2).forEach(x -> System.out.print(x + " "));
        int[] numbers3 = Arrays.copyOfRange(numbers, 4, 10);
        System.out.println();
        Arrays.stream(numbers3).forEach(x -> System.out.print(x + " "));

    }

    /**
     * asList()
     * e.g.
     * List<Integer> list = Arrays.asList(numbers);
     *
     * equals()
     * e.g.
     * Arrays.equals(numbers1, numbers2);
     *
     * fill()
     * e.g.
     * Arrays.fill(numbers, 20);
     *
     */

    @Test
    public void learn_common_operations() {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List<Integer> list = Arrays.asList(1, 2, 3);
        int[] numbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.equals(numbers, numbers2));
        Arrays.fill(numbers, 20);
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));

    }
}
