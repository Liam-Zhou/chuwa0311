package com.chuwa.exercise.collection;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author b1go
 * @date 6/12/22 4:47 PM
 */
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
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.putIfAbsent("d", 4);

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(map);

        assertEquals(1,map.get("a"));
        assertEquals(5,map.getOrDefault("e", 5));
        assertTrue(map.containsKey("a"));
        assertFalse(map.containsValue(10));

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
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 10);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.replace("a", 1);
        map.replace("a", 1, 10);
        map.replaceAll((key, val) -> val * 2);
        map.remove("d");
        map.remove("e", 10);
        map.compute("a",(key, val) -> val / 2 );
        map.computeIfAbsent("x", s -> s.length());
        map.computeIfPresent("b", (key, val)-> val * val);
    }
}
