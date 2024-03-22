package com.chuwa.learn.features.stream_api;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bigO
 * @date 5/9/22 7:19 AM
 * https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
 * https://github.com/gavinklfong/stream-api-exercises
 */
public class StreamExercise {
    @Test
    public void testMapAndFlatMap() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("word");

        //将words数组中的元素再按照字符拆分，然后字符去重，最终达到["h", "e", "l", "o", "w", "r", "d"]
        //如果使用map，是达不到直接转化成List<String>的结果
        List<String> collect = words.stream()
                //当使用 flatMap 方法时，它的目的是将流中的每个元素转换（或“映射”）成一个新的流
                //所以使用Arrays.stream而不是Arrays.asList
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void testMapAndFlatMap2() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("word");

        //将words数组中的元素再按照字符拆分，然后字符去重，最终达到["h", "e", "l", "o", "w", "r", "d"]
        //如果使用map，是达不到直接转化成List<String>的结果
        List<Stream<String>> collect = words.stream()
                .map(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("**** above are stream objects, below are character *****");
        //输出的结果没有去重，因为没有直接对String进行处理
        for (Stream<String> stringStream : collect) {
            stringStream.forEach(System.out::println);
        }
    }
}
