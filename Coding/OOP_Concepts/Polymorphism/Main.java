package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        a.Sound();
        d.Sound();
        c.Sound();
    }
}
