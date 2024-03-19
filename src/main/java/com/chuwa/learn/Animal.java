package com.chuwa.learn;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void sound() {
        System.out.println("Animal sound");
    }
}
