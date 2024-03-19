public class SUV extends Vehicle {
    @Override
    public double calculateParkingFee(int duration) {
        return duration * 12.0;
    }
}
