public class MotorCycle extends Vehicle {
    @Override
    public double calculateParkingFee(int duration) {
        return duration * 8.0;
    }
}
