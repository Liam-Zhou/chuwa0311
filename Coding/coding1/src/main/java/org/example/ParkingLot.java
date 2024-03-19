package org.example;

import java.util.ArrayList;

public class ParkingLot {
	private ArrayList<Vehicle> vehicleList;

	public ParkingLot() {
		vehicleList = new ArrayList<>();
	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		vehicleList = vehicleList;
	}

	public boolean park(Vehicle v) {
		vehicleList.add(v);
		return true;
	}

	public boolean leave(Vehicle v) {
		vehicleList.remove(v);
		return true;
	}
}
