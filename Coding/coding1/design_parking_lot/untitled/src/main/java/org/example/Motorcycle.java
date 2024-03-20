package org.example;

public class Motorcycle extends Vehicle{
    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.MOTORCYCLE;
    }
}
