package parkingdesign;

public class ParkingSlot {
    String ID;
    boolean isEmpty;
    ParkingLot parkingLot;
    int rent;

    public ParkingSlot(String ID, boolean isEmpty, ParkingLot parkingLot, int rent) {
        this.ID = ID;
        this.isEmpty = isEmpty;
        this.parkingLot = parkingLot;
        this.rent = rent;
        parkingLot.size++;
        if(isEmpty) {
            parkingLot.vacant++;
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }
}
