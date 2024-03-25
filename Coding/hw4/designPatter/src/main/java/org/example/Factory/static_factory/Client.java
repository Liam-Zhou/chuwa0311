package org.example.Factory.static_factory;

import org.example.Factory.before.Coffee;
import org.example.Factory.before.CoffeeStore;

public class Client {
    public static void main(String [] args) {
        // create 咖啡店 object
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte coffee");
        System.out.println(coffee);


    }
}
