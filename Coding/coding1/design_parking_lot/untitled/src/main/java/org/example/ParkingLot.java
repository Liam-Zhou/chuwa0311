package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(int numberOfSpots) {
        parkingSpots = new ArrayList<>(numberOfSpots);
        for (int i = 0; i < numberOfSpots; i++) {
            parkingSpots.add(new ParkingSpot(i + 1));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if(spot.isAvailable()) {
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(String licensePlate) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isAvailable() && spot.getParkedVehicle().getLicensePlate().equals(licensePlate)) {
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }


    public void printParkingLotStatus() {
        System.out.println("Parking lot Status:");
        for (ParkingSpot spot: parkingSpots) {
            if (spot.isAvailable()) {
                System.out.println("Spot " + spot.getSpotNumber() + ": Empty");
            } else {
                System.out.println("Spot " + spot.getSpotNumber() + ": " + spot.getParkedVehicle().getType() + " - " + spot.getParkedVehicle().getLicensePlate());
            }
        }
    }


}
