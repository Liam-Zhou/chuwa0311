package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysExercise {
    /**
     * e.g.
     * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
     * numbers[?]
     *
     * numbers[?] = #
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        numbers[0] = 11;
        numbers[9] = 12;
        assertEquals(11, numbers[0]); // First element should be 11 after insertion
        assertEquals(12, numbers[9]); // Last element should be 12 after insertion
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
        // Create an array of integers
        int[] numbers = {5, 2, 8, 4, 9, 1, 7, 3, 6};

        // Test binary search
        Arrays.sort(numbers);
        assertEquals(3, Arrays.binarySearch(numbers, 4)); // Search for element 4 in the sorted array

        // Test sorting
        int[] sortedNumbers = {5, 2, 8, 4, 9, 1, 7, 3, 6}; // Create an unsorted array
        Arrays.sort(sortedNumbers); // Sort the array in ascending order
        assertEquals(1, sortedNumbers[0]); // First element should be 1 after sorting
        assertEquals(9, sortedNumbers[sortedNumbers.length - 1]); // Last element should be 9 after sorting

        // Test sorting with a range
        int[] partialNumbers = {8, 12, 9, 7, 6}; // Create an unsorted array
        Arrays.sort(partialNumbers, 1, 4); // Sort a portion of the array from index 1 to 3 (inclusive)
        assertEquals(12, partialNumbers[3]); // Element at index 2 should be 2 after sorting
        assertEquals(7, partialNumbers[1]); // Element at index 6 should be 7 after sorting

        // Test parallel sorting
        int[] parallelNumbers = {5, 2, 8, 4, 9, 1, 7, 3, 6}; // Create an unsorted array
        Arrays.parallelSort(parallelNumbers); // Sort the array in parallel
        assertEquals(1, parallelNumbers[0]); // First element should be 1 after parallel sorting
        assertEquals(9, parallelNumbers[parallelNumbers.length - 1]); // Last element should be 9 after parallel sorting
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

        // Test copying the entire array
        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        assertArrayEquals(numbers, copiedNumbers); // Verify that the copied array is equal to the original array


        // Test copying a range of elements
        int[] sweet = Arrays.copyOfRange(numbers, 0,2);
        int[] correct = {1, 2};

        assertArrayEquals(sweet, correct);
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
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = {1, 2, 3, 4, 6};

        // Test converting array to list
        Integer[] numbersArray = {1, 2, 3, 4, 5}; // Convert to Integer array for compatibility with asList
        assertEquals(Arrays.asList(numbersArray), Arrays.asList(1, 2, 3, 4, 5)); // Verify conversion to list

        // Test comparing arrays
        assertTrue(Arrays.equals(numbers1, numbers2)); // Verify that equal arrays are detected
        assertFalse(Arrays.equals(numbers1, numbers3)); // Verify that different arrays are detected

        // Test filling arrays
        int[] nums = new int[5]; // Create an empty array
        Arrays.fill(nums, 20); // Fill the array with value 20
        assertArrayEquals(new int[]{20, 20, 20, 20, 20}, nums); // Verify that the array is filled correctly
    }


}
