package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import java.util.List;
public class LinkedListExerciseTest {


    /**
     * e.g.
     * List<Integer> list = new LinkedList<Integer>();
     * Inserting:
     * add(E e) or addLast(E e)
     * addFirst(E e)
     * add(int index, E element)
     * addAll(Collection c)
     * addAll(int index, Collection c)
     *
     * Retrieving:
     * getFirst()
     * getLast()
     * get(int index)
     *
     */
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<Integer> list = new LinkedList<>();
        // Test inserting elements
        list.add(5); // Add element at the end of the list
        list.addFirst(2); // Add element at the beginning of the list
        list.addLast(8);  // Add element at the end of the list
        list.add(1,3); // Add element at index 1 (indexing starts from 0)
        list.addAll(List.of(99,101)); // Add multiple elements at the end of the list

        // list : [2,3,5,8,99,101]
        assertEquals(2, list.getFirst());
        assertEquals(101, list.getLast());
        assertEquals(99, list.get(4));
    }
    /**
     * removeFirst()
     * removeLast()
     * remove(int index)
     * remove(Object o)
     * removeLastOccurrence()
     *
     * sort()
     */
    @Test
    public void learn_Remove_Sort() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(List.of(2, 4, 6, 4, 8, 10, 4));

        list.removeFirst(); // Remove the first element
        list.removeLast(); // Remove the last element
        list.remove(2); // Remove element at index 2
        list.remove(Integer.valueOf(4)); // Remove the first occurrence of element 4
        list.removeLastOccurrence(Integer.valueOf(4)); // Remove the last occurrence of element 4
        //[6,8,10]
        assertEquals(6, list.getFirst());
        assertEquals(8, list.get(1));
        assertEquals(10, list.getLast());

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.addAll(List.of(8,0,1));
        list1.sort(null);

        assertEquals(0, list1.get(0));
        assertEquals(1, list1.get(1));
        assertEquals(8, list1.getLast());


    }
}
