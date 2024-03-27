package Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.*;
import java.util.function.UnaryOperator;

public class ArrayListExerciseTest {
    private final ArrayList<String> list;
    public ArrayListExerciseTest() {
        this.list = new ArrayList<>();
    }

    public void addElements(String... elements) {
        Collections.addAll(list, elements);
    }

    public String getElement(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            return null;
        }
    }

    public int getSize() {
        return list.size();
    }

    public void addAllElements(List<String> anotherList) {
        list.addAll(anotherList);
    }

    public void removeElementByIndex(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && toIndex < list.size() && fromIndex <= toIndex) {
            list.subList(fromIndex, toIndex + 1).clear();
        }
    }

    public void removeAllElements(List<String> elementsToRemove) {
        list.removeAll(elementsToRemove);
    }

    public void clearElements() {
        list.clear();
    }

    public void updateElement(int index, String newValue) {
        if (index >= 0 && index < list.size()) {
            list.set(index, newValue);
        }
    }

    public void replaceAllElements(UnaryOperator<String> operator) {
        list.replaceAll(operator);
    }

    public boolean containsElement(String element) {
        return list.contains(element);
    }

    public int indexOfElement(String element) {
        return list.indexOf(element);
    }

    public int lastIndexOfElement(String element) {
        return list.lastIndexOf(element);
    }


    @Test
    public void learn_Inserting_And_Retrieving() {
        addElements("Apple", "Banana", "Cherry");
        Assertions.assertEquals("Banana", getElement(1));
        Assertions.assertEquals(3, getSize());
    }

    public void iterateUsingIterator() {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
    }

    public void sortList() {
        Collections.sort(list);
    }

    public void sortListWithComparator() {
        list.sort(Comparator.reverseOrder());
    }
    @Test
    public void learn_Removal_And_Checking() {
        addElements("Apple", "Banana", "Cherry", "Banana");
        removeElementByIndex(2);
        Assertions.assertEquals(3, getSize());
        Assertions.assertFalse(containsElement("Cherry"));
        Assertions.assertEquals(1, indexOfElement("Banana"));
        Assertions.assertEquals(2, lastIndexOfElement("Banana"));

        List<String> removeList = Arrays.asList("Apple", "Banana");
        removeAllElements(removeList);
        Assertions.assertEquals(0, getSize());
        clearElements();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void learn_Iterator() {
        addElements("Apple", "Banana", "Cherry");
        iterateUsingIterator(); // This will print the elements to console
    }

    @Test
    public void learn_Sorting() {
        addElements("Apple", "Banana", "Cherry", "Grapes");
        sortList();
        Assertions.assertEquals("Apple", getElement(0));
        sortListWithComparator();
        Assertions.assertEquals("Grapes", getElement(0));
    }
}
