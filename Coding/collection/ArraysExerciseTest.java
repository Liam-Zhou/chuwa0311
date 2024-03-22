import org.junit.Test;

public class ArraysExerciseTest {

    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    @Test
    public void learn_Inserting_And_Retrieving() {
        System.out.println(numbers[1]);
        numbers[1] = 1;
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
        Arrays.binarySearch(numbers, 4);
        Arrays.sort(numbers);
        Arrays.parallelSort(numbers);
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
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        int[] numbers3 = Arrays.copyOfRange(numbers, 0, 5);
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
        List<Integer> list = Arrays.asList(numbers);
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        Arrays.equals(numbers, numbers1);
        Arrays.fill(numbers, 0);
    }
}