package Collection;
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
        map.put("a",1);
        map.putIfAbsent("a",2);
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);
        map1.put("e", 5);

        System.out.println(map.get("a"));
        map.putAll(map1);

        System.out.println(map.getOrDefault("f", 0));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(1));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
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
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        map1.put("d", 4);
        map1.put("e", 5);
        map1.replace("a", 1, 2);
        map1.replace("b", 1);

        map1.forEach((k, v)-> System.out.println(k + ": " +  v));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 2);

        map1.putAll(map2);
        map1.forEach((k, v)-> System.out.println(k + ": " +  v));
        map1.remove("e");
        map1.replace("d", 4);


        System.out.println();

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.compute("one", (key, value)->value * 2);

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("one", 1);
        map3.computeIfAbsent("two", key->key.length());

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("one", 1);
        map4.computeIfPresent("one", (key, value)->value * 2);

    }
}