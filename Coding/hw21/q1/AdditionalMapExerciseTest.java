package com.chuwa.exercise.collection;

import org.junit.Test;

import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class AdditionalMapExerciseTest {

    /**
     * e.g.
     * ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     */
    @Test
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);
        map.putIfAbsent("two", 2);
        map.putIfAbsent("one", 10); // This should not change the value associated with "one"

        assertEquals(Optional.of(1), map.get("one"));
        assertEquals(Optional.of(2), map.get("two"));

        ConcurrentHashMap<String, Integer> newMap = new ConcurrentHashMap<>();
        newMap.putAll(map);
        assertEquals(newMap, map);
    }

    /**
     * e.g.
     * Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_IdentityHashMap() {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String keyOne = new String("key");
        String keyTwo = new String("key");

        map.put(keyOne, 1);
        map.putIfAbsent(keyTwo, 2); // keyTwo is a different reference

        assertNotSame(keyOne, keyTwo);
        assertEquals(Optional.of(1), map.get(keyOne));
        assertEquals(Optional.of(2), map.get(keyTwo)); // This works because key
    }

    /**
     * e.g.
     * EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     */
    @Test
    public void learn_EnumMap() {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
        enumMap.put(DayOfWeek.MONDAY, 1);
        enumMap.putIfAbsent(DayOfWeek.TUESDAY, 2);
        enumMap.putIfAbsent(DayOfWeek.MONDAY, 10); // This should not change the value for MONDAY

        assertEquals(Optional.of(1), enumMap.get(DayOfWeek.MONDAY));
        assertEquals(Optional.of(2), enumMap.get(DayOfWeek.TUESDAY));
    }
}
