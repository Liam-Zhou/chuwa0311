package com.chuwa.learn.design_pattern.creational.factory.factory_method;

public class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee(){
        return new AmericanoCoffee();
    }
}
