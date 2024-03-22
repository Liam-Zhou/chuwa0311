package com.chuwa.learn.ood_pattern.factory.simple_factory;

public class CoffeeShop {
    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        return coffee;
    }
}
