public enum VehicleType {
    MOTORCYCLE, CAR, BUS
}

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleType type;

    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    // Other methods
}

public class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate, VehicleType.MOTORCYCLE);
    }
}

public class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, VehicleType.CAR);
    }
}

public class Bus extends Vehicle {
    public Bus(String licensePlate) {
        super(licensePlate, VehicleType.BUS);
    }
}

public class ParkingSpot {
    private final VehicleType type;
    private Vehicle currentVehicle;
    private final int spotNumber;

    public ParkingSpot(VehicleType type, int spotNumber) {
        this.type = type;
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable() {
        return currentVehicle == null;
    }

    public boolean park(Vehicle vehicle) {
        if (!isAvailable() || this.type != vehicle.type) {
            return false;
        }
        this.currentVehicle = vehicle;
        return true;
    }

    public Vehicle removeVehicle() {
        Vehicle vehicle = this.currentVehicle;
        this.currentVehicle = null;
        return vehicle;
    }
}

public class ParkingFloor {
    private final List<ParkingSpot> spots = new ArrayList<>();

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
    }

    // Add methods to park and remove vehicles from spots
}

public class ParkingLot {
    private final List<ParkingFloor> floors = new ArrayList<>();

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    // Methods to manage parking across floors
}
