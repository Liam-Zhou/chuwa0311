package org.example.builder;

public class RoadBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("豪华车身");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("超豪华车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
