package org.example;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class HashSetExercise {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        // Create a set of integers for testing
        Set<Integer> set = new HashSet<>();

        // Test inserting elements
        assertTrue(set.add(1)); // Add element 1 to the set
        assertTrue(set.addAll(List.of(2, 3, 4))); // Add elements 2, 3, 4 to the set

        // Test retrieving elements
        assertTrue(set.contains(1)); // Check if set contains element 1
        assertFalse(set.contains(5)); // Check if set contains element 5 (not present)

        // Test removing elements
        assertTrue(set.remove(1)); // Remove element 1 from the set
        assertFalse(set.remove(5)); // Remove element 5 from the set (not present)
        set.clear(); // Clear all elements from the set

        // Test checking if the set is empty
        assertTrue(set.isEmpty()); // Set should be empty after clearing
    }
}
