package builder;

public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("aluminium frame");
    }

    @Override
    public void buildSeat() {
    bike.setSeat("rubber seat ");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
