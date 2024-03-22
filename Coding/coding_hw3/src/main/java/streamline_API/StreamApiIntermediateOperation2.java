package streamline_API;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiIntermediateOperation2 {

    @Test
    public void testLimit() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        col.stream().limit(3).forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        col.stream().skip(2).forEach(System.out::println);
    }

    @Test
    public void testDistinct() {
        int[] arr = new int[]{1, 2, 3, 4, 4, 2, 5};
        IntStream st = Arrays.stream(arr);
        st.distinct().forEach(System.out::println);
    }

    @Test
    public void testMap() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        // 1. 2d array
        List<String> lists1 = Arrays.asList("1", "2", "33", "4", "5");
        List<String> lists2 = Arrays.asList("6", "7", "8", "9", "10");
        List<List<String>> listsOfStrings = new ArrayList<>();
        listsOfStrings.add(lists1);
        listsOfStrings.add(lists2);
        // listOfStrings: [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]  -> [1,2,3,4,5,6,7,8,9]
        System.out.println("listsOfStrings: " + listsOfStrings);

        Stream<String> stringStream = listsOfStrings.stream().flatMap(list -> list.stream());
        Stream<Stream<String>> streamStream = listsOfStrings.stream().map(list -> list.stream());
        OptionalInt max = stringStream.mapToInt(Integer::parseInt).max();
        int asInt = max.getAsInt();
        System.out.println(asInt);

        int asInt1 = listsOfStrings
                .stream()
                .flatMap(list -> list.stream())
                .mapToInt(Integer::parseInt)
                .max().getAsInt();
        System.out.println(asInt1);
    }

    @Test
    public void testIntermediateOperationChain() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> collect = list2.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 10)
                .collect(Collectors.toList());

        list1.addAll(collect);

        System.out.println(list1);
    }
}
