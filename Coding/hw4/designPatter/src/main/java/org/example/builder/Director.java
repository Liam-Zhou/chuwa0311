package org.example.builder;

public class Director {
    // 声明builder 类型的variable
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
