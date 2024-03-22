package org.example.builder;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("Aluminum");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("Rubber");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
