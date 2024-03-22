package org.example.factory.simple_factory;

public class CoffeeShop {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        coffee = simpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
