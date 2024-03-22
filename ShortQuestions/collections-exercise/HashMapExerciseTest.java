package com.chuwa.exercise.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        map.put("one", 1);
        map.put("two", 2);
        map.put("six", 6);
        map.putIfAbsent("two", 2);
        map.put("six", 6);
        map.put("one", 2);
        map.get("one");
        map.containsKey("six");
        for (String k : map.keySet()) {
            System.out.print(k + ", ");
            System.out.println(map.get(k));
        }
        System.out.println(map.isEmpty());
        System.out.println(map.size());
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
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 6);
        System.out.println(map.replace("key1", 100));
        System.out.println(map.replace("key8", 100));
        System.out.println(map.get("key1"));
        System.out.println(map.remove("key3", 99));
        System.out.println(map.remove("key3", 6));
        map.put("key10", 10);
        map.computeIfPresent("key10", (k, v) -> v * 10);
        map.computeIfAbsent("key500", v -> 500);
        System.out.println(map.get("key500"));
        System.out.println(map.get("key10"));
    }
}
