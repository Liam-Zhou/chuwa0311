package com.chuwa.learn.design_pattern.creational.factory.static_factory;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = StaticCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}