package org.studyeasy.parent;

public class Vehicle {
    //Properties of the vehicle class
    private String engine;
    private String lights;
    private int wheels;
    private int seats;
    private int fuelTank;

    //Vehicle default constructor
    public Vehicle() {
        this.engine = "petrol";
        this.wheels = 4;
        this.seats = 4;
        this.fuelTank = 35;
        this.lights = "LED";

    }
    //Vehicle constructor with parametrise
    public Vehicle(String engine, String lights, int wheels, int seats, int fuelTank) {
        this.engine = engine;
        this.lights = lights;
        this.wheels = wheels;
        this.seats = seats;
        this.fuelTank = fuelTank;
    }

    //Getters
    public String getEngine() {
        return engine;
    }
    public String getLights() {
        return lights;
    }
    public int getWheels() {
        return wheels;
    }
    public int getSeats() {
        return seats;
    }
    public int getFuelTank() {
        return fuelTank;
    }

    //Functionalities
    public void run() {
        System.out.println("Running vehicle");
    }
}
