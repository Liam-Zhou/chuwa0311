package org.example.Factory.static_factory;

import org.example.Factory.before.AmericanCoffee;
import org.example.Factory.before.Coffee;
import org.example.Factory.before.LatteCoffee;
public class SimpleCoffeeFactory {
    // coupling factory 和 具体咖啡产品
    // 当这个方法是static，coffeeStore就不需要在创建一个factory
    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if (type.equalsIgnoreCase("american coffee")) {
            coffee = new AmericanCoffee();
        } else if (type.equalsIgnoreCase("latte coffee")) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Our store doesn't carry the coffee you ordered");
        }
        return coffee;
    }
}
