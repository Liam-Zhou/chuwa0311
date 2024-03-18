import java.util.ArrayList;
import java.util.List;

enum VehicleSize {
    Motorcycle, Compact, Large
}

abstract class Vehicle {
    protected String licensePlate;
    protected VehicleSize size;
    protected int spotsNeeded;
    protected List<ParkingSpot> parkingSpots = new ArrayList<>();

    public Vehicle(String licensePlate, VehicleSize size, int spotsNeeded) {
        this.licensePlate = licensePlate;
        this.size = size;
        this.spotsNeeded = spotsNeeded;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == this.size && spot.isAvailable();
    }

    public void parkInSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
        spot.park(this);
    }

    public void clearSpots() {
        for (ParkingSpot spot : parkingSpots) {
            spot.removeVehicle();
        }
        parkingSpots.clear();
    }

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }
}

class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, VehicleSize.Compact, 1);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate, VehicleSize.Motorcycle, 1);
    }
}

class Bus extends Vehicle {
    public Bus(String licensePlate) {
        super(licensePlate, VehicleSize.Large, 5);
    }
}

class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize size;

    public ParkingSpot(VehicleSize size) {
        this.size = size;
    }

    public boolean park(Vehicle v) {
        if (canFitVehicle(v)) {
            this.vehicle = v;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable() && (vehicle.getSize() == this.size || vehicle.getSize() == VehicleSize.Motorcycle);
    }

    public VehicleSize getSize() {
        return size;
    }
}

class ParkingLot {
    private List<ParkingSpot> spots = new ArrayList<>();

    public ParkingLot(int numCompact, int numLarge, int numMotorcycle) {
        for (int i = 0; i < numCompact; i++) {
            spots.add(new ParkingSpot(VehicleSize.Compact));
        }
        for (int i = 0; i < numLarge; i++) {
            spots.add(new ParkingSpot(VehicleSize.Large));
        }
        for (int i = 0; i < numMotorcycle; i++) {
            spots.add(new ParkingSpot(VehicleSize.Motorcycle));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canFitVehicle(vehicle) && spot.isAvailable()) {
                spot.park(vehicle);
                return true;
            }
        }
        return false;
    }
}
