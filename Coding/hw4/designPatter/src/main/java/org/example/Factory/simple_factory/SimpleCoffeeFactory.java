package org.example.Factory.simple_factory;

import org.example.Factory.before.AmericanCoffee;
import org.example.Factory.before.LatteCoffee;
import org.example.Factory.before.Coffee;
public class SimpleCoffeeFactory {
    // coupling factory 和 具体咖啡产品
    public Coffee createCoffee(String type){
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
