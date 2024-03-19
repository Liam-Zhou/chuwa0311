public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(10);

        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        Vehicle truck = new Vehicle("XYZ789", VehicleType.TRUCK);

        lot.parkVehicle(car);
        lot.parkVehicle(truck);

        lot.leaveVehicle(1);
    }
}