package com.chuwa.learn.design_pattern.creational.factory.factory_method;

public class LatteCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee(){
        return new LatteCoffee();
    }
}
