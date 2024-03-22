package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;
import static org.junit.jupiter.api.Assertions.*;
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
        map.put("a", 1);
        map.put("b", 10);
        map.put("c", 100);
        map.putIfAbsent("a", 2);
        assertEquals(10, map.get("b"));
        assertEquals("a", map.firstKey());
        assertEquals("c", map.lastKey());
        assertTrue(map.containsKey("a"));
        assertFalse(map.containsValue("22"));
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
        map.put("a", 1);
        map.put("b", 10);
        map.put("c", 100);
        map.replace("a", 1, 34);
        map.replace("b", 5);
        printMap(map);

    }

    public static void printMap(TreeMap<?, ?> map){
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.printf("%-10s : %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }
}
