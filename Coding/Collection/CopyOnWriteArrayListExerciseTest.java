package Collection;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExerciseTest {
    /**
     * e.g.
     * List list = new CopyOnWriteArrayList();
     *
     * add(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addIfAbsent(E e)
     * addAllAbsent(Collection c)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1,2);
        list.addAll(Arrays.asList(5,6));
        System.out.println(list);
        list.addAllAbsent(Arrays.asList(5,6,7));
        System.out.println(list);

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     */

    @Test
    public void learn_Iterator() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Created an iterator
        Iterator<String> itr = list.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
    }
}
