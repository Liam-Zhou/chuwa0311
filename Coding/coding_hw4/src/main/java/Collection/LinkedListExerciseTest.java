package Collection;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class LinkedListExerciseTest {
    @Test
    public void learn_Inserting_And_Retrieving() {
        LinkedList<Integer> list = new LinkedList<>();

        // Inserting elements
        list.add(10);
        list.addFirst(5);
        list.addLast(15);
        list.add(2, 20);

        // Retrieving elements
        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        int elementAtIndex2 = list.get(2);

        // Assertions
        assertEquals(5, firstElement);
        assertEquals(15, lastElement);
        assertEquals(20, elementAtIndex2);
    }

    @Test
    public void learn_Remove_Sort() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        // Removing elements
        list.removeFirst();
        list.removeLast();
        list.remove((Integer) 20); // Remove the first occurrence of 20
        list.remove(0); // Remove element at index 0

        // Sorting elements
        list.sort(Integer::compareTo);

        // Assertions
        assertEquals(0, list.size());
        assertFalse(list.contains(20));
    }
}
