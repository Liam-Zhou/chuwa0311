package com.example.coding1;
import java.util.*;
class ParkingLot {
    private List<ParkingSpot> spots;

    ParkingLot() {
        spots = new ArrayList<>();
        // Example setup, could be expanded or modified to read from a config
        spots.add(new ParkingSpot(VehicleSize.Small));
        spots.add(new ParkingSpot(VehicleSize.Medium));
        spots.add(new ParkingSpot(VehicleSize.Large));
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.fit(vehicle)) {
                try {
                    spot.park(vehicle);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return false;
    }
}