package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
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

        map.put("Apple", 100);
        map.putIfAbsent("Banana", 200);
        map.putAll(Map.of("Cherry", 300, "Date", 400));

        assertEquals(Integer.valueOf(100), map.get("Apple"));
        assertEquals("Apple", map.firstKey());
        assertEquals("Date", map.lastKey());

        assertTrue(map.containsKey("Banana"));
        assertTrue(map.containsValue(200));

        assertEquals(Set.of("Apple", "Banana", "Cherry", "Date"), map.keySet());
        assertEquals(List.of(100, 200, 300, 400), new ArrayList<>(map.values()));

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
        map.put("Apple", 100);
        map.put("Banana", 200);
        map.put("Cherry", 300);

        map.replace("Apple", 105);
        map.replace("Banana", 200, 205);
        assertEquals(Integer.valueOf(105), map.get("Apple"));
        assertEquals(Integer.valueOf(205), map.get("Banana"));

        map.remove("Cherry");
        assertFalse(map.containsKey("Cherry"));
    }
}
