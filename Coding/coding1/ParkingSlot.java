public class ParkingSlot {
    private int slotNumber;
    private boolean isEmpty;
    private Vehicle vehicle;
    private SlotSpace slotSpace;
    private int duration;

    public ParkingSlot(int slotNumber, SlotSpace slotSpace) {
        this.slotNumber = slotNumber;
        this.isEmpty = true;
        this.vehicle = null;
        this.slotSpace = slotSpace;
        this.duration = 0;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDuration() {
        return duration;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        return true;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        return true;
    }

}
