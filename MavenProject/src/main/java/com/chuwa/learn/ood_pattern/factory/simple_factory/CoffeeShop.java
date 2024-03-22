package com.chuwa.learn.ood_pattern.factory;

public class CoffeeShop {
    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if("americano".equals(type)){
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new Latte();
        } else{
            throw new RuntimeException("no such coffee");
        }
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
