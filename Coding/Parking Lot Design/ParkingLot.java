class ParkingLot {
  private ParkingSpace[] spaces;

  public ParkingLot(int numSpaces) {
    spaces = new ParkingSpace[numSpaces];
    for (int i = 0; i < numSpaces; i++) {
      ParkingSpaceType type = (i % 3 == 0) ? ParkingSpaceType.LARGE : ParkingSpaceType.COMPACT;
      spaces[i] = new ParkingSpace(i, type);
    }
  }

  public boolean parkVehicle(Vehicle vehicle) {
    for (ParkingSpace space : spaces) {
      if (!space.isOccupied() && space.getType() == vehicle.getType()) {
        return space.park(vehicle);
      }
    }
    return false;
  }

  public void printParkingLotStatus() {
    for (ParkingSpace space : spaces) {
      System.out.println("Space " + space.number + " is " +
          (space.isOccupied() ? "occupied" : "free") + ". Type: " + space.getType());
    }
  }
}