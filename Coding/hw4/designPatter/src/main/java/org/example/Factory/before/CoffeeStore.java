package org.example.Factory.before;

// 具体工厂： 提供了创建产品的方法，调用者通过该方法来获取产品
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if (type.equalsIgnoreCase("american coffee")) {
            coffee = new AmericanCoffee();
        } else if (type.equalsIgnoreCase("latte coffee")) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("Our store doesn't carry the coffee you ordered");
        }
        // 加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
