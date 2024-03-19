public class ParkingSpot {
    private int spotNumber;
    private String carType;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.carType = null;
    }

    public ParkingSpot(int spotNumber, String carType) {
        this.spotNumber = spotNumber;
        this.carType = carType;
    }

    public boolean isAvailable() {
        return carType == null;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
