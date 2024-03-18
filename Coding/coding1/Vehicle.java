package parkingdesign;

public class Vehicle {
    VehicleType type;
    String make;
    String color;


    public Vehicle(VehicleType type, String make, String color) {
        this.type = type;
        this.make = make;
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
