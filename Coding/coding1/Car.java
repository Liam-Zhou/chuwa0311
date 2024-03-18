package parkingdesign;

public class Car extends Vehicle{

    String plate;

    public Car(VehicleType type, String make, String color) {
        super(type, make, color);
    }

    public Car(VehicleType type, String make, String color, String plate) {
        super(type, make, color);
        this.plate = plate;
    }
}
