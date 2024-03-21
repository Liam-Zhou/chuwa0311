package org.chuwa.Builder;

public class ATypeBikeBuilder extends Builder {

	@Override
	public void buildFrame() {
		bike.setFrame("Aluminum");
	}

	@Override
	public void buildSeat() {
		bike.setSeat("leather seat");
	}

	@Override
	public Bike createBike() {
		return bike;
	}
}
