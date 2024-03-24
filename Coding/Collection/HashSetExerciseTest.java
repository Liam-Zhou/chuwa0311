package Collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class HashSetExerciseTest {
    /**
     * e.g.
     * Set<Integer> set= new HashSet<>();
     *
     * add(E e)
     * addAll(Collection<> c)
     *
     * get()
     * contains()
     *
     * remove(Object o)
     * clear()
     *
     * isEmpty()
     *
     *
     */

    @Test
    public void learn_Inserting_And_Retrieving_Removing() {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        Assert.assertFalse(set.isEmpty());

        Assert.assertTrue(set.contains(1));
        set.remove(2);
        set.clear();


        Assert.assertTrue(set.isEmpty());
    }
}
