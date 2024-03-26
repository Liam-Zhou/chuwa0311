package com.chuwa.learn;


import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise_W3Resourse {

    @Test
    public void testStream() {
        List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        System.out.println("Original List of numbers: " + nums);

        List<Integer> distinct = nums.stream().distinct().collect(Collectors.toList());
        distinct.stream().forEach(System.out::println);
    }

    @Test
    public void testCountNumberOfStrings() {
        List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original list of strings (colors): " + colors);
        char startingLetter = 'B';

        long count = colors.stream().filter(s -> s.startsWith(String.valueOf(startingLetter))).count();
        System.out.println(count);
    }

    @Test
    public void testAlphabets() {
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original List of strings(colors): " + colors);
        // Sort strings in ascending orderSystem.out.println(count);

        List<String> asc = colors.stream().sorted().collect(Collectors.toList());
        asc.stream().forEach(System.out::print);

        List<String> des = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        des.stream().forEach(System.out::print);
    }

    @Test
    public void testMinMax() {
        List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        System.out.println("Original list of numbers: " + nums);
        Integer max = nums.stream().max(Integer::compare).orElse(null);
        Integer min = nums.stream().min(Integer::compare).orElse(null);
    }

    @Test
    public void testGetSecondSmallest() {
        List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        int secondSmallest = nums.stream().sorted(Integer::compare).skip(1).findFirst().orElse(null);

        System.out.println(secondSmallest);
        int largest = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(largest);
    }


}
