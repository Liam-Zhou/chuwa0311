package Collection;

import org.junit.Test;

import java.util.*;

public class ArrayListExerciseTest {
    /**
     * new ArrayList()
     * add elements
     * get element
     * get Size
     * list.addAll(anotherList)
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        System.out.println(al.get(1));
        System.out.println(al.size());
        al.addAll(Arrays.asList(3,4));
        System.out.println(al);

    }

    /**
     * remove(int index)
     * remove(Object o)
     * removeRange(int fromIndex, int toIndex)
     * removeAll(Collection<?> c)
     * clear()
     *
     * Update:
     * set(int index, E e)
     * replaceAll(UnaryOperator<E> operator)
     *
     * check:
     * contains(Object o)
     * indexOf(Object o)
     * lastIndexOf(Object o)
     */
    @Test
    public void learn_Remove_Replacing_Updating() {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.remove(0);
        System.out.println(al);
        al.removeAll(Arrays.asList(3,4));
        System.out.println(al);
        al.set(1, 8);
        System.out.println(al);
        System.out.println(al.contains(8));
        System.out.println(al.indexOf(8));

    }

    /**
     * iterator()
     * hasNext()
     * next()
     * remove()
     * forEachRemaining(Consumer<? super E> action) -- from Java8
     */

    @Test
    public void learn_Iterator() {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        Iterator<Integer> i = al.iterator();
        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.next());
        if(i.next() == 3) {
            i.remove();
        }
        System.out.println(i.next());
        i.forEachRemaining(x -> System.out.println(x));
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);

    }
}
