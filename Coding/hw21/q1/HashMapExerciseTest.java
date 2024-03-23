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
        map.put("Apple", 50);
        map.putIfAbsent("Banana", 30);
        map.putAll(Map.of("Orange", 20, "Mango", 40));
        map.putIfAbsent("Apple", 60);

        int price = map.get("Apple");
        int defaultPrice = map.getOrDefault("Grape", 10);

        System.out.println("Price of Apple: " + price);
        System.out.println("Default Price: " + defaultPrice);

        boolean hasApple = map.containsKey("Apple");
        boolean hasValue50 = map.containsValue(50);

        System.out.println("Has Apple: " + hasApple);
        System.out.println("Has Value 50: " + hasValue50);
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
        map.put("Apple", 50);
        map.put("Banana", 30);

        map.replace("Apple", 50, 60);
        map.replace("Banana", 35);
        map.replaceAll((key, value) -> value + 10);

        map.remove("Apple");
        map.remove("Banana", 45);

        map.compute("Orange", (key, value) -> (value == null) ? 1 : value + 1);
        map.computeIfAbsent("Grape", k -> 200);
        map.computeIfPresent("Orange", (key, value) -> value + 50);
    }
}
