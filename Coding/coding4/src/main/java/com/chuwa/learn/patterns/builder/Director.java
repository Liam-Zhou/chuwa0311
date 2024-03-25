package com.chuwa.learn.patterns.builder;

/**
 * 指挥者类
 * 用于指导构建者如何构建产品，控制调用先后次序
 * 并向调用者返回完整的产品类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
