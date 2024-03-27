package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.*;

import static org.junit.Assert.*;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class LinkedHashMapExerciseTest {
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

        map.put("Apple", 100);
        map.putIfAbsent("Banana", 200);

        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Cherry", 300);
        map.putAll(anotherMap);

        assertEquals(Integer.valueOf(100), map.get("Apple"));
        assertEquals(Integer.valueOf(200), map.getOrDefault("Banana", 0));

        assertTrue(map.containsKey("Apple"));
        assertTrue(map.containsValue(200));

        assertEquals(new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry")), map.keySet());
        assertEquals(Arrays.asList(100, 200, 300), new ArrayList<>(map.values()));

        assertFalse(map.isEmpty());
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
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 100);
        map.put("Orange", 150);
        map.put("Grape", 200);

        map.replace("Apple", 100, 110);
        map.replace("Orange", 160);
        assertEquals(Integer.valueOf(110), map.get("Apple"));
        assertEquals(Integer.valueOf(150), map.get("Orange"));

        map.replaceAll((key, value) -> value + 10);
        assertEquals(Integer.valueOf(120), map.get("Apple"));
        assertEquals(Integer.valueOf(160), map.get("Orange"));
        assertEquals(Integer.valueOf(210), map.get("Grape"));

        map.remove("Apple");
        assertFalse(map.containsKey("Apple"));

        map.remove("Orange", 160);
        assertTrue(map.containsKey("Orange"));

        map.computeIfAbsent("Banana", k -> 200);
        map.computeIfPresent("Orange", (key, value) -> value + 50);

        assertEquals(Integer.valueOf(200), map.get("Banana"));
        assertEquals(Integer.valueOf(210), map.get("Orange"));

        map.clear();
        assertTrue(map.isEmpty());
    }
}
