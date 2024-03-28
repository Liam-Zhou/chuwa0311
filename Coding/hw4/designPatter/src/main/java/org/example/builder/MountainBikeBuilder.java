package org.example.builder;

/**
 * concrete builder（具体的构建者）
 * 用来构建Mountain Bike object
 */
public class MountainBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
