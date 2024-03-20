package com.chuwa.learn.tutorial.t06_java8.features.stream_api;

import com.chuwa.learn.tutorial.t00_common.pojo.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiCreationTest {
    @Test
    public void testCollection() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        col.forEach(System.out::println);

        // 返回一个顺序流
        Stream<Integer> stream = col.stream();
        System.out.println("Stream object:      " + stream);

        // 返回一个并行流
        Stream<Integer> parallelStream = col.parallelStream();
        System.out.println("Parallel Stream object:     " + parallelStream);
    }

    /**
     * Arrays.stream(arr);
     */
    @Test
    public void testArrays() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);
        System.out.println("Stream object:      " + stream);

        Employee e1 = new Employee(1001, "tom", 20, 2222);
        Employee e2 = new Employee(1002, "Jerry", 18, 5000);
        Employee[] arr1 = new Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
        System.out.println("Stream object:     " + stream1);
    }

    @Test
    public void testOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println("Stream object:      " + stream);
    }
}
