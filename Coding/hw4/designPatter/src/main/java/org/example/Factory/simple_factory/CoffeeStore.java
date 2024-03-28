package org.example.Factory.simple_factory;

import org.example.Factory.before.Coffee;


// 具体工厂： 提供了创建产品的方法，调用者通过该方法来获取产品
public class CoffeeStore {
    // decouple解耦合CoffeeStore 和具体咖啡产品的依赖
    public Coffee orderCoffee(String type) {

        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();

        Coffee coffee = factory.createCoffee(type);

        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
