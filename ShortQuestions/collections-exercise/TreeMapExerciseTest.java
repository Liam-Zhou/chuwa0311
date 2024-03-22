package com.chuwa.exercise.collection;

import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

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
        map.put("1", 1);
        map.put("6", 20);
        map.put("3", 25);
        map.put("9", 30);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

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
        map.put("1", 1);
        map.put("6", 20);
        map.put("3", 25);
        map.put("9", 30);
        map.replace("3", 25, 300);
        System.out.println(map.get("3"));
        System.out.println(map.replace("3", 90, 300));
        System.out.println(map.get("3"));
    }
}
