package org.example.builder;

// Builder的常规用法，Director 在创造模式中具有很重要的作用，
// 用于指导Builder该如何create，控制先后顺序

public class Client {
    public static void main(String[] args) {
        Director director1 = new Director(new MountainBikeBuilder());
        Bike bike1 = director1.construct();
        System.out.println(bike1.getSeat() + ", " + bike1.getFrame());

        Director director2 = new Director(new RoadBikeBuilder());
        Bike bike2 = director2.construct();
        System.out.println(bike2.getSeat() + ", " + bike2.getFrame());


    }
}
