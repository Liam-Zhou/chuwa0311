package Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExerciseTest {
    public <T extends Comparable<? super T>> T getMinElement(List<T> list) {
        return Collections.min(list);
    }

    public <T extends Comparable<? super T>> T getMaxElement(List<T> list) {
        return Collections.max(list);
    }

    public <T> int getElementFrequency(List<T> list, T element) {
        return Collections.frequency(list, element);
    }

    public <T> List<T> createSynchronizedList(List<T> list) {
        return Collections.synchronizedList(new ArrayList<>(list));
    }

    @Test
    public void learn_common_collections_operations() {
        List<Integer> numbers = List.of(5, 2, 8, 3, 5, 9);

        int minElement = getMinElement(numbers);
        Assertions.assertEquals(2, minElement);

        int maxElement = getMaxElement(numbers);
        Assertions.assertEquals(9, maxElement);

        int frequencyOfFive = getElementFrequency(numbers, 5);
        Assertions.assertEquals(2, frequencyOfFive);
    }

    @Test
    public void learn_thread_safe_ArrayList() {
        List<String> fruits = List.of("Apple", "Banana", "Cherry");

        // Create a synchronized list
        List<String> synchronizedList = createSynchronizedList(fruits);

        // Test thread safety by adding an element concurrently
        Thread thread1 = new Thread(() -> synchronizedList.add("Grapes"));
        Thread thread2 = new Thread(() -> synchronizedList.add("Orange"));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if all elements are added to the synchronized list
        Assertions.assertTrue(synchronizedList.contains("Grapes"));
        Assertions.assertTrue(synchronizedList.contains("Orange"));
    }
}
