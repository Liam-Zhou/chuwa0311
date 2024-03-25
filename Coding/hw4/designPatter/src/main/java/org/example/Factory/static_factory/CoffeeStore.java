package org.example.Factory.static_factory;

import org.example.Factory.before.Coffee;


// 具体工厂： 提供了创建产品的方法，调用者通过该方法来获取产品
public class CoffeeStore {
    // decouple解耦合CoffeeStore 和具体咖啡产品的依赖
    public Coffee orderCoffee(String type) {

        //因为createCoffee是static所以无需创建一个factory object了
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);


        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
