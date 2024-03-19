import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<ParkingSlot> parkingSlots;
    private Map<SlotSpace, List<ParkingSlot>> slotSpaceToSlot;

    public ParkingSlot parkVehicle(Vehicle vehicle) {
        return null;
    }

    public boolean removeVehicle(ParkingSlot slot) {
        double fee = slot.getVehicle().calculateParkingFee(slot.getDuration());
        slot.removeVehicle(slot.getVehicle());
        return true;
    }
}
