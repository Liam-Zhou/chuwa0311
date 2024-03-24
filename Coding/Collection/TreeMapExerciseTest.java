package Collection;

import org.junit.Test;

import java.util.*;
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
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println(map);
        map.putIfAbsent("Two", 22);
        System.out.println(map);
        System.out.println(map.get("One"));
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
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println(map);
        map.replace("One", 3);
        System.out.println(map);


    }
}
