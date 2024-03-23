package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CollectionsExercise {
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
        List<Integer> nums = List.of(1, 8, 5, 5, 12);

        // Test find the minimum element
        assertEquals(1, Collections.min(nums)); // Minimum element in the list should be 1

        // Test finding the maximum element
        assertEquals(12, Collections.max(nums)); // Maximum element in the list should be 5

        // Test finding the frequency of an element
        assertEquals(2, Collections.frequency(nums, 5)); // Frequency of element 5 in the list should be 2
    }
    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // Add elements to the synchronized list
        list.add(1);
        list.add(2);
        list.add(3);
        // Verify that the elements are added successfully
        assertEquals(3, list.size()); // Size of the synchronized list should be 3
    }
}
