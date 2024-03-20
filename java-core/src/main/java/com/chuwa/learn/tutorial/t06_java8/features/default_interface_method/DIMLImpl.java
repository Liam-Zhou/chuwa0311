package com.chuwa.learn.tutorial.t06_java8.features.default_interface_method;

public class DIMLImpl implements DIML{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        DIMLImpl dim = new DIMLImpl();
        System.out.println("Override method: " + dim.add(1, 2));
        System.out.println("default method: " + dim.substract(1, 2));
        System.out.println("static method: " + DIML.blogName());
    }

}
