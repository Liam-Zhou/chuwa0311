package com.chuwa.learn.ood_pattern.factory.simple_factory;

public abstract class Coffee {

    public abstract String getName();
    public void addSuger(){
        System.out.println("add suger");
    }

    public void addMilk(){
        System.out.println("add milk");
    }
}
