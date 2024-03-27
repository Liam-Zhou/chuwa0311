enum ParkingSpaceType{
  COMPACT,
  LARGE
}
class ParkingSpace {
  private int number;
  private boolean isOccupied;
  private final ParkingSpaceType type;
  private Vehicle vehicle;

  public ParkingSpace(int number, boolean isOccupied, ParkingSpaceType type) {
    this.number = number;
    this.isOccupied = false;
    this.type = type;
  }
  public boolean park(Vehicle vehicle) {
    if (!isOccupied && vehicle.getParkingSpaceType() == this.type) {
      this.vehicle = vehicle;
      this.isOccupied = true;
      return true;
    }
    return false;
  }
  public boolean leave() {
    if (isOccupied) {
      this.vehicle = null;
      isOccupied = false;
      return true;
    }
    return false;
  }

  public ParkingSpaceType getType() {
    return type;
  }

  public boolean isOccupied() {
    return isOccupied;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }
}