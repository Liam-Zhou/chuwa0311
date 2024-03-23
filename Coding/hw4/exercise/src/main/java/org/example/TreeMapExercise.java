package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TreeMapExercise {
    /**
     * e.g.
     * TreeMap<String, Integer> map = new TreeMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * get(Object key)
     * firstKey()
     * lastKey()
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
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        // Test retrieving elements
        assertEquals(1, map.get("Apple"));
        assertEquals("Apple", map.firstKey());
        assertEquals("Orange", map.lastKey());

        // Test checking if the map contains keys or values
        assertTrue(map.containsKey("Apple"));
        assertTrue(map.containsValue(3)); // Map contains value 3
        assertFalse(map.containsValue(5)); // Map does not contain value 5

        // Test getting key set and value collection
        assertEquals(Set.of("Apple", "Orange", "Banana"), map.keySet()); // Get the set of keys in the map
        assertEquals(List.of(1, 2, 3), new ArrayList<>(map.values())); // Get the collection of values in the map

        // Test checking if the map is empty
        assertFalse(map.isEmpty()); // Map should not be empty
    }
}
