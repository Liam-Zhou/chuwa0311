package org.example.builder;

public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Carbon Fiber");
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
