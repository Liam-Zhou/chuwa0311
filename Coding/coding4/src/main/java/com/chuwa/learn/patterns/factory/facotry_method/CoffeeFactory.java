package com.chuwa.learn.patterns.factory.facotry_method;

/**
 * 工厂方法模式，包括如下角色
 * 抽象产品
 * 具体产品
 * 抽象工厂
 * 具体工厂
 * 当前类为抽象工厂
 */
public interface CoffeeFactory {
    Coffee createCoffee();
}
