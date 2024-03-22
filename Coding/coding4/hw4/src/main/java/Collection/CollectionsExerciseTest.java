package Collection;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author b1go
 * @date 6/12/22 4:48 PM
 */
public class CollectionsExerciseTest {

    /**
     * Collections.min(list))
     * min(Collection c, Comparator comp)
     *
     * Collections.max(list)
     * max(Collection c, Comparator comp)
     *
     * frequency(Collection c, object o)
     */

    @Test
    public void learn_common_collections_operations() {
        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(5);
        number.add(1);
        number.add(3);
        number.add(7);
        number.add(6);
        System.out.println(Collections.max(number));
        System.out.println(Collections.min(number));
        System.out.println(Collections.frequency(number,5));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");

        List<String> synchronizedList = Collections.synchronizedList(arrayList);

        synchronized (synchronizedList) {
            for (String fruit : synchronizedList) {
                System.out.println(fruit);
            }
        }
    }
}