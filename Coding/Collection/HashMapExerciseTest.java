package Collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('d', 9);
        map.put('c', 1);
        map.put('e', 5);

        System.out.println(map.get('c'));
        map.getOrDefault('z', -1);
        System.out.println(map.containsKey('e'));
        System.out.println(map.containsKey('y'));
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
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('d', 9);
        map.put('c', 1);
        map.put('e', 5);

        map.replace('a', 10);
        map.replaceAll((k,v) -> v + 1);
        System.out.println(map);
    }
}
