import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> parkingSpots;

    public ParkingLot(int capacity) {
        parkingSpots = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            parkingSpots.add(new ParkingSpot(i));
        }
    }

    public ParkingSpot findFirstAvailableSpot() {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) {
                return spot;
            }
        }
        return null;
    }

    public boolean parkVehicle(String carType) {
        ParkingSpot availableSpot = findFirstAvailableSpot();
        if (availableSpot != null) {
            return false;
        }
        availableSpot.setCarType(carType);
        return false;
    }
}
