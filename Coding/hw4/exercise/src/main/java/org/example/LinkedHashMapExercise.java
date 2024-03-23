package org.example;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class LinkedHashMapExercise {
    /**
     * e.g.
     * HashMap<String, Integer> map = new LinkedHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * getOrDefault(Object key, V defaultValue)
     *
     * containsKey(Object key)
     * containsValue(Object value)
     *
     * keySet()
     * values()
     * isEmpty()
     */

    @Test
    public void learn_Inserting_And_Retrieving() {
        Map<String, Integer> map = new LinkedHashMap<>();

        // Test inserting elements
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Test retrieving elements
        assertEquals(1, map.get("one")); // Retrieve value associated with key "one"
        assertNull(map.get("four")); // Key "four" does not exist, so null should be returned
        assertEquals(0, map.getOrDefault("four", 0)); // Key "four" does not exist, so default value 0 should be returned

        // Test checking if the map contains keys or values
        assertTrue(map.containsKey("two")); // Map contains key "two"
        assertFalse(map.containsKey("five")); // Map does not contain key "five"
        assertTrue(map.containsValue(3)); // Map contains value 3
        assertFalse(map.containsValue(5)); // Map does not contain value 5

        // Test getting key set and value set
        assertEquals(Set.of("one", "two", "three"), map.keySet()); // Get the key set
        assertEquals(List.of(1, 2, 3), new ArrayList<>(map.values())); // Get the value set

        // Test checking if the map is empty
        assertFalse(map.isEmpty()); // Map should not be empty
    }


    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     * replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
     *
     * remove(Object key)
     * remove(Object key, Object value)
     *
     * compute(Key, BiFunction)
     * computeIfAbsent(Key, Function)
     * computeIfPresent(Key, BiFunction)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Test replacing elements
        assertEquals(2, map.replace("two", 22)); // Replace value associated with key "two" with 22
        assertFalse(map.replace("four", 4, 44)); // Replace failed as key "four" does not exist
        map.replace("three", map.get("three") * 2); // Double the value associated with key "three"

        // Test removing elements
        assertEquals(1, map.remove("one")); // Remove element with key "one" and return its value
        assertNull(map.remove("five")); // Remove element with key "five" (does not exist), should return null
        assertFalse(map.remove("two", 2)); // Remove failed as key "two" is associated with value 22, not 2

        // Test computing values
        map.compute("six", (k, v) -> (v == null) ? 6 : v + 6); // If key "six" exists, increment its value by 6; otherwise, set value to 6
        map.computeIfAbsent("seven", k -> 7); // If key "seven" does not exist, compute its value as 7
        map.computeIfPresent("eight", (k, v) -> v * 2); // If key "eight" exists, double its value

        // Verify the state of the map after operations
        assertEquals(Map.of("two", 22, "three", 6, "six", 6, "seven", 7), map);
    }
}
