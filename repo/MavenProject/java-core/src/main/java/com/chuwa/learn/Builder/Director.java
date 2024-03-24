package main.java.com.chuwa.learn.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike build() {
        this.builder.buildSeat();
        this.builder.buildFrame();

        return builder.createBike();
    }
}
