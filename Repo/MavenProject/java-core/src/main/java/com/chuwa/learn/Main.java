package com.chuwa.learn;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        System.out.println("List of numbers: " + nums);

        //get average
        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        //convert a list of strings to uppercase or lowercase using streams.
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> toUpper = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> toLower = colors.stream().map(String::toLowerCase).collect(Collectors.toList());


        List < Integer > numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumEven = numbers.stream().filter(i -> i % 2 == 0).reduce(Integer::sum).orElse(0);
        int sumOdd = numbers.stream().filter(i -> i % 2 == 1).reduce(Integer::sum).orElse(0);

        int sumEven1 = numbers.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        int sumOdd1 = numbers.stream().filter(i -> i% 2 == 1).mapToInt(Integer::intValue).sum();

        System.out.println(sumOdd1);



    }
}