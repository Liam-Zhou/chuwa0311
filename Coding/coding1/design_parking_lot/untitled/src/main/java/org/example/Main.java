package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a parking lot with 10 spots
        ParkingLot parkingLot = new ParkingLot(10);

        // Park some vehicles
        parkingLot.parkVehicle(new Car("ABC123"));
        parkingLot.parkVehicle(new Motorcycle("XYZ456"));

        // Print parking lot status
        parkingLot.printParkingLotStatus();

        // Unpark a vehicle
        parkingLot.unparkVehicle("ABC123");

        // Print parking lot status again
        parkingLot.printParkingLotStatus();
    }
}