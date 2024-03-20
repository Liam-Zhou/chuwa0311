package com.chuwa.learn;


public class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }

    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}


