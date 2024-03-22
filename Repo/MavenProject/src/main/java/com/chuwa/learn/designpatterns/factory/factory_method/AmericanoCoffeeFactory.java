package com.chuwa.learn.designpatterns.factory.factory_method;

public class AmericanoCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
