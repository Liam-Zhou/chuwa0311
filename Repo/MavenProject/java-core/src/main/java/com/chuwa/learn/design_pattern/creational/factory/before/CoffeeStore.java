package com.chuwa.learn.design_pattern.creational.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("americano".equals(type)) {
            coffee = new AmericanoCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Sorry, coffee type not supported");
        }
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}