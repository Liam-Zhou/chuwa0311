package com.chuwa.exercise.collection;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        String element = list.get(1);
        assertEquals("Python", element);

        assertEquals(3, list.size());

        List<String> anotherList = new ArrayList<>();
        anotherList.add("JavaScript");
        list.addAll(anotherList);
        assertEquals(4, list.size());
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
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));

        list.remove(0);
        list.remove("Python");

        list.set(0, "c#");

        assertTrue(list.contains("c#"));
        assertEquals(0, list.indexOf("c#"));

        list.replaceAll(s -> s.toUpperCase());
        assertEquals("C#", list.get(0));

        list.clear();
        assertTrue(list.isEmpty());
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
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String language = iterator.next();
            if (language.equals("Python")) {
                iterator.remove();
            }
        }
        assertEquals(2, list.size());
    }


    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */


    @Test
    public void learn_Sorting() {
        List<String> list = new ArrayList<>(Arrays.asList("Python", "Java", "C++"));

        Collections.sort(list);
        assertEquals(Arrays.asList("C++", "Java", "Python"), list);

        list.sort(Collections.reverseOrder());
        assertEquals(Arrays.asList("Python", "Java", "C++"), list);
    }

}

