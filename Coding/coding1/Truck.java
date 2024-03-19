public class Truck extends Vehicle {
    @Override
    public double calculateParkingFee(int duration) {
        return duration * 15.0;
    }
}
