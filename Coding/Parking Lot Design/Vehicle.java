
class Vehicle {
  private ParkingSpaceType parkingSpaceType;
  private String plate;
  public Vehicle() {
  }
  public Vehicle(ParkingSpaceType parkingSpaceType, String plate) {
    this.parkingSpaceType = parkingSpaceType;
    this.plate = plate;
  }

  public ParkingSpaceType getParkingSpaceType() {
    return parkingSpaceType;
  }

  public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
    this.parkingSpaceType = parkingSpaceType;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }
}