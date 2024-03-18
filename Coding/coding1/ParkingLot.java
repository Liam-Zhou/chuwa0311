import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        spots = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            spots.add(new ParkingSpot(i + 1));
        }
    }

    public boolean parked(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.isAvailable()) {
                spot.parked(vehicle);
                return true;
            }
        }
        return false;
    }

    public void unpark(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (!spot.isAvailable() && spot.getVehicle() == vehicle) {
                spot.unpark();
                return;
            }
        }
    }
}
