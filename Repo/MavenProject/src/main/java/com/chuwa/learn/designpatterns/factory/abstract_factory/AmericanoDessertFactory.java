package com.chuwa.learn.designpatterns.factory.abstract_factory;

public class AmericanoDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
