import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(int numberOfSpots) {
        spots = new ArrayList<>(numberOfSpots);
        for (int i = 1; i <= numberOfSpots; i++) {
            VehicleType type = VehicleType.values()[i % VehicleType.values().length];
            spots.add(new ParkingSpot(i, type));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable() && spot.getType() == vehicle.getType()) {
                return spot.assignVehicle(vehicle);
            }
        }
        System.out.println("Failed to park the vehicle. No available spot.");
        return false;
    }

    public boolean leaveVehicle(int spotNumber) {
        for (ParkingSpot spot : spots) {
            if (spot.getSpotNumber() == spotNumber) {
                return spot.removeVehicle();
            }
        }
        System.out.println("Spot number is not valid.");
        return false;
    }
}