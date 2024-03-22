package com.chuwa.learn.designpatterns.builder;

public class MobileBuilder extends Builder {
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
