package com.chuwa.learn.design_pattern.creational.factory.simple_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory coffeeFactory = new SimpleCoffeeFactory();

        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}