package parkingdesign;

public class Ticket {
    ParkingSlot slot;
    Vehicle vehicle;

    public Ticket(ParkingSlot slot, Vehicle vehicle) {
        this.slot = slot;
        this.vehicle = vehicle;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }
}
