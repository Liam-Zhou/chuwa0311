package com.patterns.builder.demo1;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("aluminium");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("rubber");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}