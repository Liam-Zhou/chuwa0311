package com.chuwa.learn.designpatterns.factory.factory_method;

public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
