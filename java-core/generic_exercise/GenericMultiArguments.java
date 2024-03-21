package com.chuwa.tutorial.t01_basic.generic_copy;

/**
 * @author b1go
 * @date 7/25/22 12:14 AM
 */
public class GenericMultiArguments {

    public static <X, Y, Z> void temp(X x, Y y, Z z) {
        System.out.println("X is " + x);
        System.out.println("Y is " + y);
        System.out.println("Z is " + z);
    }

    public static void main(String[] args) {
        temp(1, "hello", 3.8);
    }
}
