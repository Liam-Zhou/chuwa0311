package Collection;

import org.junit.Test;

import java.util.*;
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
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Max: " + Collections.max(list));
        Comparator<Integer> reverse = Comparator.reverseOrder();
        System.out.println("Min with Comparator: " + Collections.min(list, reverse));
        System.out.println("Max with Comparator: " + Collections.max(list, reverse));
        System.out.println("Frequency of 1: " + Collections.frequency(list, 1));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("Synchronized List: " + synchronizedList);
        synchronized (synchronizedList) {
            for (int num : synchronizedList) {
                System.out.println(num);
            }
        }
    }
}
