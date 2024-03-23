package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
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
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(5, numbers[4]);

        numbers[0] = 20;
        assertEquals(20, numbers[0]);
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
        int[] numbers = {9, 5, 3, 8, 2, 6, 7, 1, 4, 10};

        Arrays.sort(numbers);
        assertEquals(3, Arrays.binarySearch(numbers, 4));

        Arrays.sort(numbers, 0, 5);
        assertTrue(numbers[0] < numbers[5]);

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
        int[] numbers = {1, 2, 3, 4, 5};

        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        assertArrayEquals(numbers, numbersCopy);

        int[] rangeCopy = Arrays.copyOfRange(numbers, 0, 3);
        assertArrayEquals(new int[]{1, 2, 3}, rangeCopy);
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
        Integer[] numbers = {1, 2, 3, 4, 5};
        Integer[] numbersToCompare = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(numbers);
        assertEquals(5, list.size());

        assertTrue(Arrays.equals(numbers, numbersToCompare));

        Arrays.fill(numbers, 20);
        assertTrue(Arrays.stream(numbers).allMatch(n -> n == 20));
    }
}
