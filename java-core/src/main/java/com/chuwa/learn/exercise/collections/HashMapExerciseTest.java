package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HashMapExerciseTest {
    public static void printMap(HashMap<?, ?> map){
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.printf("%-10s : %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }
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
        map.put("b", 10);
        map.put("c", 100);
        map.putIfAbsent("a", 2);
        printMap((HashMap<?, ?>) map);
        map.put("a", 200);
        printMap((HashMap<?, ?>) map);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(map);
        printMap((HashMap<?, ?>) map2);

        assertEquals(200,map.get("a"));
        assertEquals(33,map.getOrDefault("x", 33));
        assertTrue(map.containsKey("a"));
        assertFalse(map.containsValue(44));

        for(String s:map.keySet()){
            System.out.println(s);
        }
        for(Integer i:map.values()){
            System.out.println(i);
        }

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
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 7);
        map.put("e", 6);
        map.replace("a", 10);
        printMap(map);
        map.replace("a", 10, 20);
        printMap(map);
        map.replaceAll((key, oldValue) -> oldValue * oldValue);
        printMap(map);
        map.remove("d");
        map.remove("e", 36);
        printMap(map);
        map.compute("a",(key, oldValue) -> oldValue / 2 );
        printMap(map);
        map.computeIfAbsent("x", s -> s.length());
        System.out.println(map.get("x"));
        map.computeIfPresent("b", (key, val)-> val * 10);
        System.out.println(map.get("b"));


    }
}
