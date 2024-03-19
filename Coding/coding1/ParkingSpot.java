package com.example.coding1;

class ParkingSpot {
    private final VehicleSize size;
    private Vehicle currentVehicle;

    ParkingSpot(VehicleSize size) {
        this.size = size;
    }

    boolean fit(Vehicle v) {
        return currentVehicle == null && v.getSize().ordinal() <= this.size.ordinal();
    }

    void park(Vehicle v) throws Exception {
        if (!fit(v)) {
            throw new Exception("Parking spot does not fit vehicle.");
        }
        currentVehicle = v;
    }

    void leave() {
        this.currentVehicle = null;
    }

    boolean isAvailable() {
        return this.currentVehicle == null;
    }
}
