package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HashMapExerciseTest {
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

        // Put operations
        map.put("Apple", 3);
        map.putIfAbsent("Banana", 2);

        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Cherry", 5);
        map.putAll(anotherMap);

        // Retrieving values
        assertEquals(Integer.valueOf(3), map.get("Apple"));
        assertEquals(Integer.valueOf(4), map.getOrDefault("Orange", 4));

        // Key and value checks
        assertTrue(map.containsKey("Banana"));
        assertTrue(map.containsValue(2));

        // Keyset and values
        assertTrue(map.keySet().containsAll(Arrays.asList("Apple", "Banana", "Cherry")));
        assertTrue(map.values().containsAll(Arrays.asList(3, 2, 5)));

        // Empty check
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
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 4);
        map.put("Cherry", 5);

        // Replace operations
        map.replace("Apple", 10);
        map.replace("Banana", 4, 20);
        map.replaceAll((key, value) -> value * 2); // Double each value

        // Verify the replacements
        assertEquals(Integer.valueOf(20), map.get("Apple"));
        assertEquals(Integer.valueOf(40), map.get("Banana"));
        assertEquals(Integer.valueOf(10), map.get("Cherry"));

        // Remove operations
        map.remove("Apple");
        assertFalse(map.containsKey("Apple"));

        map.remove("Banana", 40); // Removes only if key-value pair matches
        assertFalse(map.containsKey("Banana"));

        // Compute methods
        BiFunction<String, Integer, Integer> biFunction = (key, value) -> value != null ? value + 5 : 1;
        map.compute("Cherry", biFunction); // Increase Cherry's value by 5
        assertEquals(Integer.valueOf(15), map.get("Cherry"));

        //computeIfAbsent 方法的函数签名期望的是一个 Function 类型的参数
        //该函数接受一个与Map键相同类型的参数，并返回一个与Map值相同类型的结果。
        Function<String, Integer> function = key -> 42;
        map.computeIfAbsent("Date", function); // Adds "Date" with value 42
        assertEquals(Integer.valueOf(42), map.get("Date"));

        map.computeIfPresent("Cherry", (key, value) -> value + 3); // Increases Cherry's value by 3
        assertEquals(Integer.valueOf(18), map.get("Cherry"));

    }
}
