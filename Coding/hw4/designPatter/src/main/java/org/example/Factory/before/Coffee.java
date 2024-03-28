package org.example.Factory.before;

// 定义了产品的规范，描述了产品的主要特性和功能
public abstract class Coffee {
    // An abstract method is a method that doesn't have a body,
    // and it's intended to be overridden by subclasses.
    public abstract String getName();
    public void addSugar(){
        System.out.println("add sugar");
    }
    public void addMilk(){
        System.out.println("add milk");
    }


}
