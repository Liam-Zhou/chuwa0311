package org.example.factory.simple_factory;

public class SimpleCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("americano".equals(type)) {
            coffee = new Americano();
        } else if ("latte".equals(type)) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("No such coffee");
        }

        return coffee;
    }
}
