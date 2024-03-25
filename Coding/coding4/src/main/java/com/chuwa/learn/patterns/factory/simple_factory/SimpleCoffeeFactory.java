package com.chuwa.learn.patterns.factory.simple_factory;

/**
 * 简单咖啡工厂类，用来生产咖啡
 * 简单工厂具有如下成员：
 * 抽象产品
 * 具体产品
 * 具体工厂
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("No such type");
        }
        return coffee;
    }
}
