package main.java.com.chuwa.learn.Builder;

public class MobileBuilder extends Builder{

    public void buildFrame() {
        bike.setFrame("carbon fiber");
    }

    public void buildSeat() {
        bike.setSeat("leather");
    }

    public Bike createBike() {
        return bike;
    }
}
