package Inheritance;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void Display(){
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
