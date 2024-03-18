public class ParkingSpot {
    private int spotNum;
    private boolean available;
    private Vehicle vehicle;

    public ParkingSpot(int spotNum) {
        this.spotNum = spotNum;
        available = true;
        vehicle = null;
    }

    public boolean isAvailable(){
        return available;
    }

    public void parked(Vehicle vehicle){
        this.vehicle = vehicle;
        available = false;
    }

    public void unpark(){
        this.vehicle = null;
        available = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
