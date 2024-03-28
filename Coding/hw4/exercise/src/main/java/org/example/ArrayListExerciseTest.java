package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import java.util.function.UnaryOperator;

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
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        //Test elements to the ArrayList
        assertEquals("Apple", list.get(0));
        assertEquals("Banana", list.get(1));
        assertEquals(3, list.size());

        List<String> list2 = new ArrayList<>();
        list2.add("Mango");
        list2.add("Peach");

        list.addAll(list2);

        assertEquals(5, list.size());
        assertEquals("Mango",list.get(3));
        assertEquals("Peach", list.get(4));
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
        // Create a new ArrayList
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango", "Grapes"));

        // Test removing elements by index and object
        list.remove(1); // Remove element at index 1
        assertFalse(list.contains("Banana")); // Banana should not exist in the list
        assertTrue(list.contains("Orange")); // Orange should still exist in the list
        list.remove("Mango"); // Remove element "Mango"
        assertFalse(list.contains("Mango")); // Mango should not exist in the list

        // Test removing a range of elements
        list.subList(1, 3).clear(); // Remove elements from index 1 to 2 (exclusive)
        assertFalse(list.contains("Orange")); // Orange should not exist in the list
        assertFalse(list.contains("Grapes")); // Grapes should not exist in the list

        // Test removeAll
        List<String> removeList = Arrays.asList("Apple", "Mango");
        list.removeAll(removeList); // Remove elements present in removeList
        assertFalse(list.contains("Apple")); // Apple should not exist in the list
        assertFalse(list.contains("Mango")); // Mango should not exist in the list

        // Test clear
        list.clear(); // Clear the list
        assertTrue(list.isEmpty()); // List should be empty

        // Test updating elements
        list.addAll(Arrays.asList("Apple", "Banana", "Orange"));
        list.set(0, "Mango");
        assertEquals("Mango", list.get(0));

        // Test replaceAll
        list.replaceAll(s->s.toUpperCase());
        assertTrue(list.stream().allMatch(s -> s.equals(s.toUpperCase()))); // All elements should be in uppercase

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("APPLE","BANANA","ORANGE"));
        // Check contains, indexOf, lastIndexOf
        assertTrue(list2.contains("APPLE"));
        assertEquals(0, list2.indexOf("APPLE"));
        assertEquals(2, list2.lastIndexOf("ORANGE"));
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
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C"));
        Iterator<String> iterator = list.iterator();
        // Test Iterator
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("B", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("C", iterator.next());

        // Test remove method
        iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("A", iterator.next());
        iterator.remove(); // remove "A"
        assertEquals("B", list.get(0)); // B moves to index 0

        // Test forEachRemaining method (from Java 8)
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));
        iterator = list1.iterator();
        iterator.next(); // Move to the first element B
        iterator.forEachRemaining(System.out::println);
        // output: B, C (print remaining elements after the current position)
    }

    /**
     * sort(List<T> list)
     * Collections.sort(List<T> t)
     * Comparator.reverseOrder()
     */

    @Test
    public void learn_Sorting() {
        List<Integer> list = new ArrayList<>(Arrays.asList(90,1,2,3,4));
        Collections.sort(list);
        assertEquals(1, list.get(0));
        assertEquals(90, list.get(list.size()-1));

        Collections.sort(list, Comparator.reverseOrder());
        assertEquals(90, list.get(0));
        assertEquals(1, list.get(list.size()-1));
    }

    public static void main(String[] args) {


    }

}
