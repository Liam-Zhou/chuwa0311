package com.chuwa.learn.patterns.factory.facotry_method;

/**
 * 具体工厂
 */
public class LatteCoffeeFactory  implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
