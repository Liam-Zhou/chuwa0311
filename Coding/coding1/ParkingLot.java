<<<<<<< HEAD
enum VehicleType{
    MOTOCYCLE, CAR, BUS
}

enum SpotType{
    SMALL, COMPACT, LARGE
}

abstract class Vehical{
    protected VehicleType type;
    private final String licensePlate;

    public Vehical(VehicleType type, String licensePlate){
        this.type = type;
        this.licensePlate = licensePlate;
    }

    public VehicalType getType(){
        return this.type;
    }

    public String getLiceString(){
        return licensePlate;
    }

    abstract boolean canFitInSpot(ParkingLot spot);
}


class Motocycle extends Vehical{
    public Motocycle(String licensePlate){
        super(VehicalType.MOTOCYCLE, licensePlate);
    }

    @Override
    boolean canFitInSpot(ParkingSpot spot){
        return true;
    }
}

class Car extends Vehical{
    public Car(String licensePlate){
        super(VehicalType.CAR, licensePlate);
    }

    boolean canFitInSpot(ParkingSpot spot){
        return spot.getType() == SpotType.COMPACT || spot.getType() == SpotType.LARGE;
    }
}

class Bus extends Vehical{
    public Bus(String licensePlate){
        super(VehicleType.BUS, licensePlate);
    }

    boolean canFitInSpot(ParkingSpot spot){
        return spot.getType() == SpotType.LARGE;
    }
}

public class ParkingSpot {
    private final SpotType type;
    private boolean isAvailable;
    private Vehicle currentVehicle;

    public ParkingSpot(SpotType type){
        this.type = type;
        this.isAvailable = true;
    }

    boolean park(Vehical vehical){
        if (!isAvailable || !vehical.canFitInSpot(this)){
            return false;
        }
        isAvailable = false;
        currentVehicle = vehicle;
        return true;
    }

    void leave(){
        isAvailable = true;
        currentVehicle = null;
    }

    public SpotType getType(){
        return type;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
}

class ParkingLevel{
    private final List<ParkingSpot> spots;

    public ParkingLevel(int numSmall, int numCompact, int numLarge){
        spots = new ArrayList<>();
        for(int i = 0; i<numSmall; i++){
            spots.add(new ParkingSpot(SpotType.SMALL));
        }
        for(int i = 0; i<numCompact; i++){
            spots.add(new ParkingSpot(SpotType.COMPACT));
        }
        for(int i = 0; i<numLarge; i++){
            spots.add(new ParkingSpot(SpotType.LARGE));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot: spots){
            if(spot.park(vehicle)){
                return true;
            }
        }
        return false;
    }
}

public class ParkingLot{
    private final List<ParkingLevel> levels;

    public ParkingLot(int numLevels, int numSmall, int numLarge){
        levels = new ArrayList<>();
        for(int i = 0; i<numLevels; i++){
            levels.add(new ParkingLevel(numSmall, numCompact, numLarge));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingLevel level:levels){
            if(level.parkVehicle(vehicle)){
                return true;
            }
            return false;
        }
    }
}

=======
enum VehicleType{
    MOTOCYCLE, CAR, BUS
}

enum SpotType{
    SMALL, COMPACT, LARGE
}

abstract class Vehical{
    protected VehicleType type;
    private final String licensePlate;

    public Vehical(VehicleType type, String licensePlate){
        this.type = type;
        this.licensePlate = licensePlate;
    }

    public VehicalType getType(){
        return this.type;
    }

    public String getLiceString(){
        return licensePlate;
    }

    abstract boolean canFitInSpot(ParkingLot spot);
}


class Motocycle extends Vehical{
    public Motocycle(String licensePlate){
        super(VehicalType.MOTOCYCLE, licensePlate);
    }

    @Override
    boolean canFitInSpot(ParkingSpot spot){
        return true;
    }
}

class Car extends Vehical{
    public Car(String licensePlate){
        super(VehicalType.CAR, licensePlate);
    }

    boolean canFitInSpot(ParkingSpot spot){
        return spot.getType() == SpotType.COMPACT || spot.getType() == SpotType.LARGE;
    }
}

class Bus extends Vehical{
    public Bus(String licensePlate){
        super(VehicleType.BUS, licensePlate);
    }

    boolean canFitInSpot(ParkingSpot spot){
        return spot.getType() == SpotType.LARGE;
    }
}

public class ParkingSpot {
    private final SpotType type;
    private boolean isAvailable;
    private Vehicle currentVehicle;

    public ParkingSpot(SpotType type){
        this.type = type;
        this.isAvailable = true;
    }

    boolean park(Vehical vehical){
        if (!isAvailable || !vehical.canFitInSpot(this)){
            return false;
        }
        isAvailable = false;
        currentVehicle = vehicle;
        return true;
    }

    void leave(){
        isAvailable = true;
        currentVehicle = null;
    }

    public SpotType getType(){
        return type;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
}

class ParkingLevel{
    private final List<ParkingSpot> spots;

    public ParkingLevel(int numSmall, int numCompact, int numLarge){
        spots = new ArrayList<>();
        for(int i = 0; i<numSmall; i++){
            spots.add(new ParkingSpot(SpotType.SMALL));
        }
        for(int i = 0; i<numCompact; i++){
            spots.add(new ParkingSpot(SpotType.COMPACT));
        }
        for(int i = 0; i<numLarge; i++){
            spots.add(new ParkingSpot(SpotType.LARGE));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot: spots){
            if(spot.park(vehicle)){
                return true;
            }
        }
        return false;
    }
}

public class ParkingLot{
    private final List<ParkingLevel> levels;

    public ParkingLot(int numLevels, int numSmall, int numLarge){
        levels = new ArrayList<>();
        for(int i = 0; i<numLevels; i++){
            levels.add(new ParkingLevel(numSmall, numCompact, numLarge));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingLevel level:levels){
            if(level.parkVehicle(vehicle)){
                return true;
            }
            return false;
        }
    }
}

>>>>>>> origin/Haolong_Liu/main
