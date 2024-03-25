package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
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
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Retrieving elements
        assertEquals(5, numbers[4]);

        // Inserting (actually replacing)
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
        int[] numbers = {9, 5, 3, 8, 4, 2, 1, 7, 6, 10};

        // Binary search (Note: The array must be sorted first)
        Arrays.sort(numbers); // Sorting array
        assertEquals(5, Arrays.binarySearch(numbers, 6)); // Index may vary after sorting

        // Partial sort
        Arrays.sort(numbers, 0, 5); // Only sort the first five elements
        assertTrue(numbers[0] <= numbers[1] && numbers[1] <= numbers[2]); // Check if first 3 are sorted

        // Parallel sort
        Arrays.parallelSort(numbers); // Sorts the entire array in parallel
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, numbers);
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

        // Copy of array
        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, copiedNumbers);

        // Copy of range
        int[] partialCopiedNumbers = Arrays.copyOfRange(numbers, 0, 3);
        assertArrayEquals(new int[]{1, 2, 3}, partialCopiedNumbers);
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
        Integer[] sameNumbers = {1, 2, 3, 4, 5};
        Integer[] differentNumbers = {5, 4, 3, 2, 1};

        // As List
        List<Integer> numberList = Arrays.asList(numbers);
        assertTrue(numberList.containsAll(Arrays.asList(1, 2, 3, 4, 5)));

        // Equals
        assertTrue(Arrays.equals(numbers, sameNumbers));
        assertFalse(Arrays.equals(numbers, differentNumbers));

        // Fill
        Arrays.fill(numbers, 20);
        assertTrue(Arrays.equals(new Integer[]{20, 20, 20, 20, 20}, numbers));
    }
}
