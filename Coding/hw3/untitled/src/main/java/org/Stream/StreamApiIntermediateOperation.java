package org.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Collections 讲的是数据，Stream讲的是计算（CPU）
 * 1. Stream 自己不会存储元素
 * 2. Stream 不会改变源对象，相反，他们会返回一个持有结果的新stream
 * 3. Stream操作是延迟执行的，这意味着他们会等到需要结果的时候才执行。
 * Stream执行流程：
 * 1. 创建Stream： 获取一个数据源
 * 2. 中间操作： 一个操作链： 对数据进行处理
 * 3. 终止操作： 一旦执行中止操作，则会开始执行中间操作链，并产生结果。之后，不会再被使用。
 */

public class StreamApiIntermediateOperation {
    /**
     * 创建Stream的Intermediate Operation
     * <p>
     * 一，筛选
     * 1. filter(Predicate p) - 接受lambda, 从流中排出某些元素
     * 2. limit(n) - 截断流，使其元素不超过给定的数量
     * 3. skip(n) - 跳过前n个元素
     * 4. distinct() - 筛选，通过元素的hashcode(), equals()去除重复元素
     * <p>
     * 二，映射
     * 1, map(function f) element -> black box(f) -> new element
     * 2, flatMap(function f)
     * 三， 排序
     * 1, sorted
     */
    public static void testFilter() {
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = col.stream();
        stream.filter(a -> a % 2 == 0).forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        Stream<String> nameStream = employees.stream().map(Employee::getName);
        nameStream.filter(name->name.length() > 6).forEach(System.out::println);

    }
    public static void testLimit() {
        List<Integer> list = Arrays.asList(1,3,4,9,10);
        Stream<Integer> streamList = list.stream();
        streamList.limit(3).forEach(System.out::println);
    }
    public static void testSkip() {
        List<Integer> list = Arrays.asList(1,3,4,9,10);
        Stream<Integer> streamList = list.stream();
        streamList.skip(2).forEach(System.out::println);
    }

    public static void testDistinct() {
        String[] arr = new String[]{"love", "apple", "sweet", "love"};
        Stream<String>streamList = Arrays.stream(arr);
        streamList.distinct().forEach(System.out::println);
    }
    /**
     * Mapping
     * map(Function f): Processes the data using the function f.
     */
    public static void testMap() {
        List<String> list = Arrays.asList("l", "o", "ve", "pristine");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    /**
     * 把两个string里面的数字相加并求和。 1 + 2+ 3 + ... + 9 + 10
     */

    public static void testFlatMap() {
        List<String> list1 = Arrays.asList("1","3","25","120");
        List<String> list2 = Arrays.asList("9","17","75","180");
        List<List<String>> listsOfStrings = new ArrayList<>();
        listsOfStrings.add(list1);
        listsOfStrings.add(list2);
        //"1", "3", "25", "120", "9", "17", "75", and "180"
        //把一个二维的string flatten为一个string stream对象。注意flatMap里，input是list, 输出是list转换的stream对象
        Stream<String> stringStream = listsOfStrings.stream().flatMap(list -> list.stream());
        //stringStream.forEach(System.out::println);
        //如果是使用普通map，则生成的是Stream<Stream>对象
        Stream<Stream<String>> streamStream = listsOfStrings.stream().map(list->list.stream());
        //streamStream.forEach(System.out::println);

        //将string 转为int数组，然后找出max值，此时max()方法返回的是Optional<Integer>
        OptionalInt max = stringStream.mapToInt(Integer::parseInt).max();
        // 从Optional里拿出int数值
        int myMax = max.getAsInt();

        // 2.使用flatmap找到最大值。不分步骤。 日常工作这么写。
        int maxVal = listsOfStrings.stream()
                .flatMap(list->list.stream())
                .mapToInt(Integer::parseInt)
                .max().getAsInt();
        System.out.println(max);
    }
    public static void testIntermediateOperationChain() {
        //ArrayList<Integer> list1 = (ArrayList<Integer>) Arrays.asList(1, 2, 3);
        //ArrayList<Integer> list2 = (ArrayList<Integer>) Arrays.asList(4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        // Find even numbers in list2 and multiply them by 10
        List<Integer> collect = list2.stream()
                .filter(a -> a % 2 == 0)
                .map(a -> a * 10)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
    public static void testSorted() {
        List<Integer> list = Arrays.asList(91,3,4,1998,1987,2024,0);
        // method1
        //list.stream().sorted().forEach(System.out::println);
        List<Employee> employeeList = EmployeeData.getEmployees();
        //employeeList.stream().forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

        Stream<Employee> employeeStream = employeeList.stream();
        Stream<Employee> sortStream = employeeStream.sorted(Comparator.comparing(Employee::getAge));
        sortStream.forEach(System.out::println);
    }
    public static void main(String[] args) {
        //testSorted();

    }
}
