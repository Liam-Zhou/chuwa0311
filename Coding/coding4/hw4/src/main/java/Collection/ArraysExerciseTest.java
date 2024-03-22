package Collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(numbers[1]);
        numbers[0] = 0;
        System.out.println(numbers[0]);
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
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(numbers, 3);
        System.out.println(index);

        sort(numbers);
        stream(numbers).forEach(System.out::println);

        int [] numbers1 = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};

        sort(numbers1, 3,7);
        System.out.println();
        stream(numbers1).forEach(System.out::print);

        int [] numbers2 = {3,1,4,2,5};
        parallelSort(numbers2);
        System.out.println("\nparallel sort");
        stream(numbers2).forEach(System.out::print);

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
        int[] number = {1, 2, 3, 4, 5};
        int[] number1 = copyOf(number, 4);
        stream(number1).forEach(System.out::print);
        System.out.println();
        int[] number2 = copyOfRange(number, 1,4);
        stream(number2).forEach(System.out::print);
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
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.asList(numbers);
        List<Integer> list1 = Arrays.asList(numbers);

        System.out.println(Arrays.equals(numbers,numbers1));

        Integer[] numbers2 = new Integer[5];
        Arrays.fill(numbers2, 20);
        Arrays.stream(numbers2).forEach(System.out::println);
    }
}
