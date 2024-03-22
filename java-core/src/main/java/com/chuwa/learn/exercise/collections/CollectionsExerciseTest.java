package com.chuwa.learn.exercise.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 7);
        assertEquals(1, Collections.min(list));
        assertEquals(7, Collections.max(list));
        assertEquals(1, Collections.max(list, Collections.reverseOrder()));
        assertEquals(7, Collections.min(list, Collections.reverseOrder()));
        assertEquals(3, Collections.frequency(list, 7));

    }

    /**
     * synchronizedList()
     */

    @Test
    public void learn_thread_safe_ArrayList() {
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
    }
}
