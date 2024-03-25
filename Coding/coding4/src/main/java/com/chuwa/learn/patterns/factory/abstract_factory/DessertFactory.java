package com.chuwa.learn.patterns.factory.abstract_factory;

/**
 * 抽象工厂类
 */
public interface DessertFactory {
    Coffee createCoffee();
    Dessert createDessert();
}
