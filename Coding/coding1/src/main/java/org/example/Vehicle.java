package org.example;

public abstract class Vehicle {
	protected String licensePlate;
	protected VehicleSize size;

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public VehicleSize getSize() {
		return size;
	}

	public void setSize(VehicleSize size) {
		this.size = size;
	}
}
