public class Sedan extends Vehicle {
    @Override
    public double calculateParkingFee(int duration) {
        return duration * 10.0;
    }
}
