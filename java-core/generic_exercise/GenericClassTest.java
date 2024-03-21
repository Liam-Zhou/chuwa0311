package com.chuwa.tutorial.t01_basic.generic_copy;

import com.chuwa.tutorial.t01_basic.generic.GenericClass;

/**
 * @author b1go
 * @date 7/25/22 12:18 AM
 */
public class GenericClassTest {

    public static void main(String[] args) {
        // Test for Integer type
        GenericClass<Integer> integerGenericClass = new GenericClass<>(6);
        System.out.println(integerGenericClass.getObj());

        // Test for double type
        GenericClass<Double> doubleGenericClass = new GenericClass<>(8.8);
        System.out.println(doubleGenericClass.getObj());

        // Test for String type
        GenericClass<String> stringGenericClass = new GenericClass<>("Hello");
        System.out.println(stringGenericClass.getObj());
    }
}
