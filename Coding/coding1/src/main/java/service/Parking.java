package service;

import strategy.ParkingChargeStrategy;
import exception.InvalidVehicleNumberException;
import exception.ParkingFullException;
import model.Ticket;
import model.Vehicle;

public interface Parking {

    public Ticket park(Vehicle vehicle) throws ParkingFullException;

    public int unPark(Ticket ticket, ParkingChargeStrategy parkingCostStrategy) throws InvalidVehicleNumberException;

}
