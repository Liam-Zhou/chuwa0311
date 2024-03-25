package org.example.Factory.simple_factory;

import org.example.Factory.before.Coffee;

// 具体产品：实现或继承abstract product的子类
public class LatteCoffee extends Coffee {
    public String getName() {
        return "Latte Coffee";
    }
}
