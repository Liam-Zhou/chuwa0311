public class ParkingSpot {
    private final int spotNumber;
    private Vehicle vehicle;
    private final VehicleType type;

    public ParkingSpot(int number, VehicleType type) {
        this.spotNumber = number;
        this.type = type;
    }

    public boolean assignVehicle(Vehicle vehicle) {
        if (this.vehicle == null) {
            this.vehicle = vehicle;
            return true;
        }
        return false;
    }

    public boolean removeVehicle() {
        if (this.vehicle != null) {
            this.vehicle = null;
            return true;
        }
        return false;
    }

    // Getters
    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isAvailable() {
        return this.vehicle == null;
    }
}