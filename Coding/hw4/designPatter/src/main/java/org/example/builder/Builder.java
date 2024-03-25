package org.example.builder;


public abstract class Builder {
    // 声明bike 类型的variable，并进行赋值
    protected Bike bike = new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();

    // create bike method
    public abstract Bike createBike();
}
