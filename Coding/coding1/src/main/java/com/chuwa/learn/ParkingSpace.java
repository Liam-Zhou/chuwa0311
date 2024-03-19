package com.chuwa.learn;
public class ParkingSpace {
    private Vehicle vehicle;
    private Size size;
    private boolean available;
    private Location location;

    public ParkingSpace(Vehicle vehicle, Size size, Location location) {
        this.vehicle = vehicle;
        this.size = size;
        this.available = true;
        this.location = location;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
