package com.chuwa.exercise.collection;

import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 2);

        assertEquals(Optional.of(1), Collections.min(list));

        assertEquals(Optional.of(5), Collections.max(list));

        Comparator<Integer> comparator = Comparator.reverseOrder();
        assertEquals(Optional.of(5), Collections.min(list, comparator));
        assertEquals(Optional.of(1), Collections.max(list, comparator));

        assertEquals(3, Collections.frequency(list, 2));
    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> syncList = Collections.synchronizedList(list);

        synchronized(syncList) {
            for (Integer item : syncList) {
                System.out.println(item);
            }
        }

        assertNotNull(syncList);
    }
}
