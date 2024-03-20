package org.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
    public static void testMapAndFlatMap() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("word");

        List<String> stringList = words.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        stringList.forEach(n -> System.out.println(n));
    }
    public static void testMapAndFlatMap2() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("word");
        List<Stream<String>> collect = words.stream()
                .map(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(n -> System.out.println(n));
        //streams are reference-based and thus distinct by default.
        //System.out.println("**** above are stream objects, below are character *****");
        for(Stream<String> stringStream : collect) {
            stringStream.forEach(System.out::println);
        }
    }
    public static void main(String[] args) {

        testMapAndFlatMap2();
    }
}
