package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.Arrays;

public class TreeMapExerciseTest {
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

        // Inserting values
        map.put("Apple", 50);
        map.putIfAbsent("Banana", 30);

        Map<String, Integer> anotherMap = new TreeMap<>();
        anotherMap.put("Cherry", 75);
        map.putAll(anotherMap);

        // Retrieving values
        assertEquals(Integer.valueOf(50), map.get("Apple"));
        assertEquals("Apple", map.firstKey());
        assertEquals("Cherry", map.lastKey());

        // Checking keys and values
        assertTrue(map.containsKey("Banana"));
        assertTrue(map.containsValue(30));

        // Keyset and values
        assertTrue(map.keySet().containsAll(Arrays.asList("Apple", "Banana", "Cherry")));
        assertTrue(map.values().containsAll(Arrays.asList(50, 30, 75)));

        // Check if map is empty
        assertFalse(map.isEmpty());
    }

    /**
     * replace(K key, V oldValue, V newValue)
     * replace(K key, V value)
     *
     * remove(Object key)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Cherry", 75);

        // Replacing entries
        map.replace("Apple", 100);
        map.replace("Banana", 30, 60);

        // Verify the replacements
        assertEquals(Integer.valueOf(100), map.get("Apple"));
        assertEquals(Integer.valueOf(60), map.get("Banana"));

        // Removing entries
        map.remove("Cherry");
        assertFalse(map.containsKey("Cherry"));

        // Check final map content
        assertEquals(2, map.size());
        assertTrue(map.containsKey("Apple"));
        assertTrue(map.containsKey("Banana"));
    }
}
