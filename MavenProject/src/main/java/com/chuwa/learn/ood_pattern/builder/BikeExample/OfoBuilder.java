package com.chuwa.learn.ood_pattern.builder;

public class OfoBuilder extends Builder{

    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum alloy frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Rubber Saddle");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
