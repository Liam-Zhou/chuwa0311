package Inheritance;

public class Car extends Vehicle{
    private String model;

    public Car(String brand, int year, String model){
        super(brand, year);
        this.model = model;
    }
    @Override
    public void Display() {
        super.Display();
        System.out.println("Model: " + model);
    }
}
