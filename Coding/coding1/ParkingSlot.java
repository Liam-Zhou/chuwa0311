public class ParkingSlot {
    private int slotNumber;
    private VehicleType allowedVehicleType;
    private boolean isOccupied;
    private Vehicle parkedVehicle;

    // Constructor
    public ParkingSlot(int slotNumber, VehicleType allowedVehicleType) {
        this.slotNumber = slotNumber;
        this.allowedVehicleType = allowedVehicleType;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }

    // Getters and setters

    public boolean parkVehicle(Vehicle vehicle) {
    }

    public boolean removeVehicle() {
    }
}