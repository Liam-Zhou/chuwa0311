package com.chuwa.learn.design_pattern.creational.factory.simple_factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee;

        if ("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Sorry, coffee type not supported");

        }

        return coffee;
    }
}