package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExerciseTest {
    /**
     * Collections.min(list))
     * min(Collection c, Comparator comp)
     *
     * Collections.max(list)
     * max(Collection c, Comparator comp)
     *
     * frequency(Collection c, object o)
     */

    @Test
    public void learn_common_collections_operations() {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        // Testing min and max without custom comparator
        assertEquals(Integer.valueOf(1), Collections.min(list));
        assertEquals(Integer.valueOf(9), Collections.max(list));

        // Testing min and max with custom comparator
        Comparator<Integer> comparator = Comparator.reverseOrder();
        assertEquals(Integer.valueOf(9), Collections.min(list, comparator));
        assertEquals(Integer.valueOf(1), Collections.max(list, comparator));

        // Testing frequency
        assertEquals(3, Collections.frequency(list, 5)); // '5' appears three times
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Make the list thread-safe
        List<Integer> syncList = Collections.synchronizedList(list);

        // No direct way to test if a list is synchronized, but we can confirm that the list
        // is not modified and can be accessed in a synchronized block
        synchronized (syncList) {
            assertEquals(Integer.valueOf(1), syncList.get(0));
            assertEquals(Integer.valueOf(2), syncList.get(1)); // Accessing elements
            syncList.add(6); // Modifying list within synchronized block
            assertEquals(6, syncList.size()); // Check the modification
        }
    }
}
