package org.example;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.parkedVehicle = null;
    }

    public boolean isAvailable() {
        return parkedVehicle == null;
    }

    public void parkVehicle(Vehicle vehicle) {
        parkedVehicle = vehicle;
    }

    public void unparkVehicle() {
        parkedVehicle = null;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }


}
