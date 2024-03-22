package org.example;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class HashMapExercise {
    /**
     * e.g.
     * Map<String, Integer> map = new HashMap<>();
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
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Test inserting element if absent
        map.putIfAbsent("d", 4); // Key "d" does not exist, so it should be added
        map.putIfAbsent("a", 5); // Key "a" already exists, so it should not be added again
        assertEquals(1, map.get("a"));

        // Test inserting all elements from another map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("e", 5);
        map2.put("f", 6);
        map.putAll(map2);
        assertEquals(6, map.size());

        // Test retrieving elements
        assertNull(map.get("x")); // Key "x" does not exist, so it should return null
        // Test retrieving elements with default value
        assertEquals(1, map.getOrDefault("a", -1)); // Key "a" exists, so it should return value 1
        assertEquals(-1, map.getOrDefault("x", -1)); // Key "x" does not exist, so it should return default value -1

        // Test checking if keys or values exist
        assertTrue(map.containsKey("b")); // Key "b" exists in the map
        assertFalse(map.containsKey("x")); // Key "x" does not exist in the map
        assertTrue(map.containsValue(3)); // Value 3 exists in the map
        assertFalse(map.containsValue(7)); // Value 7 does not exist in the map

        // Test getting key set and values
        assertEquals(Set.of("a", "b", "c", "d", "e", "f"), map.keySet()); // Get set of keys in the map
        assertEquals(List.of(1, 2, 3, 4, 5, 6), new ArrayList<>(map.values())); // Get list of values in the map

        // Test checking if the map is empty
        assertFalse(map.isEmpty()); // Map is not empty
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
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // Test replacing elements
        assertFalse(map.replace("a", 11, 10)); // Replace failed as value of key "a" is not 1
        map.replace("c", 30); // Replace value of key "c" with 30

        // Test replacing all elements
        map.replaceAll((k, v) -> v * 2); // Double each value in the map

        // Test removing elements
        assertEquals(2, map.remove("a")); // Remove element with key "a" and return its value
        assertNull(map.remove("x")); // Remove element with key "x" (does not exist), should return null

        // Test removing elements with specific value
        assertTrue(map.remove("b", 4)); // Remove element with key "b" and value 4
        assertFalse(map.remove("c", 100)); // Remove failed as value of key "c" is not 100

        // Test computing values
        map.compute("d", (k, v) -> (v == null) ? 1 : v + 1); // If key "d" exists, increment its value by 1; otherwise, set value to 1
        map.computeIfAbsent("e", k -> 5); // If key "e" does not exist, compute its value as 5
        map.computeIfPresent("f", (k, v) -> v * 2); // If key "f" exists, double its value

        // Verify the state of the map after operations
        assertEquals(Map.of("c", 60, "d", 1, "e", 5), map);
    }
}