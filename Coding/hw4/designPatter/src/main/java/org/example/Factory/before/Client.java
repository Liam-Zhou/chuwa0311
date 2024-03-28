package org.example.Factory.before;

public class Client {
    public static void main(String[] args) {
        // create coffeeStore
        CoffeeStore store = new CoffeeStore();
        // order coffee
        Coffee coffee = store.orderCoffee("American Coffee");
        System.out.println(coffee.getName());
    }

}

