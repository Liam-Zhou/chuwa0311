package com.chuwa.learn.ood_pattern.builder;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Carbon Fiber frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Leather Saddle");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
