package com.chuwa.learn;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Canine");
        Animal cat = new Cat("Feline");

        System.out.println("Dog species: " + dog.getSpecies()); // Output: Dog species: Canine
        System.out.println("Cat species: " + cat.getSpecies()); // Output: Cat species: Feline

        dog.sound(); // Output: Woof!
        cat.sound(); // Output: Meow!
    }
}