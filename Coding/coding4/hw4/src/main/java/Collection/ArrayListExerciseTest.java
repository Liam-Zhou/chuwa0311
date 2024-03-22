package Collection;

import org.junit.Test;

import java.util.*;

/**
 * @author b1go
 * @date 6/12/22 4:43 PM
 */
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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Element at 1: " + list.get(1));
        System.out.println("The length:" + list.size());
        List<Integer> list1 = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.addAll(list1);
        list.stream().forEach(System.out::print);
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
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        list.stream().forEach(System.out::print);

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.subList(1, 3).clear();
        System.out.println(list1);

        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
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
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
        }

        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num == 2) {
                iterator.remove();
            }
        }

        iterator = numbers.iterator();
        iterator.forEachRemaining(System.out::println);
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(1);
        array.add(7);
        array.add(2);
        array.add(5);
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array, Comparator.reverseOrder());
        System.out.println(array);
    }
}