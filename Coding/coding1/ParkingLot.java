package parkingdesign;

public class ParkingLot {
    String name;
    String address;
    int size;
    int vacant;

    public ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public ParkingLot(String name, String address, int size, int vacant) {
        this.name = name;
        this.address = address;
        this.size = size;
        this.vacant = vacant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getVacant() {
        return vacant;
    }

    public void setVacant(int vacant) {
        this.vacant = vacant;
    }
}
