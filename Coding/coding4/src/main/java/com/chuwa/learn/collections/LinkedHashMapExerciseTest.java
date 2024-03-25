package com.chuwa.learn.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * LinkedHashMap 是 Java 中 HashMap 的一个子类，它结合了哈希表的优点和链表的顺序性。
 * 这意味着它既可以像 HashMap 一样提供快速的存取能力，
 * 又能保持条目插入的顺序，或者是按照最近最少使用（LRU）顺序，这取决于其构造时的设置。
 * Map<K, V> lruCache = new LinkedHashMap<K, V>(initialCapacity, loadFactor, true);
 * initialCapacity 是初始容量。
 * loadFactor 是负载因子，通常设置为 0.75f
 * 最后的布尔参数 true 表示按照访问顺序排序，而不是插入顺序。
 * 如果设置为 false 或不设置，LinkedHashMap 将按照插入顺序排序。
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

//        int initialCapacity = 16; // 初始容量
//        float loadFactor = 0.75f; // 负载因子
//
//        //创建一个按访问顺序排序的 LinkedHashMap
//        Map<String, Integer> lruCache = new LinkedHashMap<>(initialCapacity, loadFactor, true) {
//            @Override
//            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
//                return size() > initialCapacity; // 限制大小，超出初始容量时移除最老的元素
//            }
//        };

        // Initialize the LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting elements
        map.put("Apple", 3);
        map.putIfAbsent("Banana", 5);

        // Using another map to putAll
        Map<String, Integer> anotherMap = new LinkedHashMap<>();
        anotherMap.put("Cherry", 8);
        map.putAll(anotherMap);

        // Retrieving values
        assertEquals(Integer.valueOf(3), map.get("Apple"));
        assertEquals(Integer.valueOf(10), map.getOrDefault("Orange", 10)); // Using getOrDefault

        // Checking keys and values
        assertTrue(map.containsKey("Banana"));
        assertTrue(map.containsValue(5));

        // Checking order in LinkedHashMap
        assertEquals("[Apple, Banana, Cherry]", map.keySet().toString()); // Checks the order of keys
        assertEquals("[3, 5, 8]", map.values().toString()); // Checks the order of values

        // isEmpty check
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
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 8);

        // Replace operations
        map.replace("Apple", 10);
        map.replace("Banana", 5, 12);
        map.replaceAll((key, value) -> value * 2); // Double the values

        // Validate the replacements
        assertEquals(Integer.valueOf(20), map.get("Apple"));
        assertEquals(Integer.valueOf(24), map.get("Banana"));
        assertEquals(Integer.valueOf(16), map.get("Cherry"));

        // Remove operations
        map.remove("Apple");
        assertFalse(map.containsKey("Apple"));

        map.remove("Banana", 24); // Removes only if key-value pair matches
        assertFalse(map.containsKey("Banana"));

        // Compute operations
        BiFunction<String, Integer, Integer> addFive = (key, value) -> value + 5;
        map.compute("Cherry", addFive); // Adds 5 to the Cherry's value
        assertEquals(Integer.valueOf(21), map.get("Cherry"));

        Function<String, Integer> setFortyTwo = key -> 42;
        map.computeIfAbsent("Date", setFortyTwo); // Adds "Date" with value 42
        assertEquals(Integer.valueOf(42), map.get("Date"));

        map.computeIfPresent("Cherry", (key, value) -> value + 3); // Adds 3 to Cherry's value if it's present
        assertEquals(Integer.valueOf(24), map.get("Cherry"));

    }
}
