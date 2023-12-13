package org.studyeasy.vehicles;
import org.studyeasy.parent.Vehicle;

public class Truck extends Vehicle {
    private String steering;
    private String musicSystem;
    private String airConditioner;
    private int container;

    public Truck(String steering, String musicSystem, String airConditioner, int container) {
        super();
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public Truck(String engine, String lights, int wheels, int seats, int fuelTank, String steering, String musicSystem, String airConditioner, int container) {
        super(engine, lights, wheels, seats, fuelTank);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }
    public String getMusicSystem() {
        return musicSystem;
    }
    public String getAirConditioner() {
        return airConditioner;
    }
    public int getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "Truck [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem() + ", getAirConditioner()=" + getAirConditioner()
                + ", getContainer()=" + getContainer() + "]";
    }
    public void run() {
        System.out.println("Running truck");
        System.out.println(toString());
    }
}
