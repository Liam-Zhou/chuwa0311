package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.IdentityHashMap;
import java.util.EnumMap;
import java.util.Map;
import java.time.DayOfWeek;

public class AdditionalMapExerciseTest {
    /**
     * e.g.
     * ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     * putAll(Map<? extends K, ? extends V> m)
     *
     * ConcurrentHashMap是一个线程安全的HashMap实现。
     * 它通过分段锁（segmentation）的方式提供更高的并发性。
     * 在多线程环境中，它允许多个线程同时读取和写入，而无需进行外部同步。
     */
    @Test
    public void learn_ConcurrentHashMap() {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Basic operations
        map.put("Apple", 3);
        assertEquals(Integer.valueOf(3), map.get("Apple"));

        map.putIfAbsent("Banana", 5);
        assertEquals(Integer.valueOf(5), map.get("Banana"));

        // Attempting to put "Banana" again with putIfAbsent should leave the original value
        map.putIfAbsent("Banana", 10);
        assertEquals(Integer.valueOf(5), map.get("Banana"));

        // Testing putAll
        Map<String, Integer> anotherMap = new ConcurrentHashMap<>();
        anotherMap.put("Cherry", 7);
        anotherMap.put("Date", 4);
        map.putAll(anotherMap);
        assertEquals(Integer.valueOf(7), map.get("Cherry"));
        assertEquals(Integer.valueOf(4), map.get("Date"));
    }

    /**
     * e.g.
     * Map<DayOfWeek, Integer> map = new IdentityHashMap<>();
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     *
     * IdentityHashMap使用引用相等（==）而不是对象的等价性（equals()）来比较键。
     * 这意味着即使两个键对象内容相同但不是同一个对象时，IdentityHashMap也会将它们视为不同的键。
     */
    @Test
    public void learn_IdentityHashMap() {
        Map<DayOfWeek, Integer> map = new IdentityHashMap<>();

        // IdentityHashMap uses equality check (==) rather than equals() method
        DayOfWeek monday1 = DayOfWeek.MONDAY;
        DayOfWeek monday2 = DayOfWeek.valueOf("MONDAY");

        // In IdentityHashMap, these are considered same keys
        map.put(monday1, 1);
        map.put(monday2, 2);

        // Assertions
        assertEquals(Integer.valueOf(2), map.get(monday1));
        assertEquals(Integer.valueOf(2), map.get(monday2));

        // IdentityHashMap's peculiar behavior with duplicate literals
        map.putIfAbsent(monday1, 3); //not added
        assertEquals(Integer.valueOf(2), map.get(monday1));
    }

    /**
     * e.g.
     * EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);
     *
     * put(K key, V value)
     * putIfAbsent(K key, V value)
     *
     * EnumMap是一个与枚举类型一起使用的专用Map实现。
     * 它内部以数组形式存储值，这使得它非常高效。键必须是单个枚举类型的枚举值。
     */
    @Test
    public void learn_EnumMap() {
        EnumMap<DayOfWeek, Integer> enumMap = new EnumMap<>(DayOfWeek.class);

        // Adding elements
        enumMap.put(DayOfWeek.MONDAY, 1);
        assertEquals(Integer.valueOf(1), enumMap.get(DayOfWeek.MONDAY));

        // PutIfAbsent
        enumMap.putIfAbsent(DayOfWeek.MONDAY, 10);
        assertEquals(Integer.valueOf(1), enumMap.get(DayOfWeek.MONDAY)); // Value remains unchanged

        enumMap.putIfAbsent(DayOfWeek.TUESDAY, 2);
        assertEquals(Integer.valueOf(2), enumMap.get(DayOfWeek.TUESDAY));

    }
}
