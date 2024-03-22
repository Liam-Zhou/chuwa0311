package com.chuwa.learn.designpatterns.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("americano");

        System.out.println(coffee.getName());
    }
}
