package com.chuwa.learn.patterns.factory.static_factory;

/**
 * 静态咖啡工厂类，不需要再创建工厂对象了
 * 简单工厂具有如下成员：
 * 抽象产品
 * 具体产品
 * 具体工厂
 */
public class StaticCoffeeFactory {
    public static Coffee createCoffee(String type) {
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
