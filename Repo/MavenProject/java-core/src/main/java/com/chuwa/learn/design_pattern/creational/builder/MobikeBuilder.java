package com.chuwa.learn.design_pattern.creational.builder;

public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("carbon frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("leather seat");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}