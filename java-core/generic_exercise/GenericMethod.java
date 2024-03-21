package com.chuwa.tutorial.t01_basic.generic_copy;

/**
 * @author b1go
 * @date 7/25/22 12:03 AM
 */
public class GenericMethod {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 6, 7, 8,
                MaximumGenericTest.maximum(6, 7, 8));
        System.out.printf("Max of %.1f, %.1f and %.1f is %.1f\n\n", 2.1, 3.6, 1.8,
                MaximumGenericTest.maximum(2.1, 3.6, 1.8));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                MaximumGenericTest.maximum("pear", "apple", "orange"));
    }
}


class MaximumGenericTest <T> {
    /**
     * determines the largest of three Comparable objects
     */
    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}
