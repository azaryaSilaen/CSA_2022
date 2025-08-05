package UsingObjects;/*
Author: Azarya Silaen
 */

public class Car {

    //class variables
    private String make;
    private String model;
    private int numberOfDoors;
    private double topSpeed;
    private double price;

    //constructor
    public Car(String make, String model, int numberOfDoors, double topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    //secondary constructor
    public Car (String make, String model, double topSpeed, double price) {
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;

    }
    public Car (int numberOfDoors, double topSpeed, double price) {
        make = "unknown";
        model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;

    }
    public Car (String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }

    //toString method
    @Override
    public String toString() {
        return "make = " + make + '\n' +
                "model = " + model + '\n' +
                "numberOfDoors = " + numberOfDoors + '\n' +
                "topSpeed = " + topSpeed + '\n' +
                "price = " + price;
    }
}
