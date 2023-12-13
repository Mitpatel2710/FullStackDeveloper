package org.studyeasy.vehicles;
import org.studyeasy.parent.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();    // call to our default constructor
        this.handle = "short";
    }

    //Parametrise constructor
    public Bike(String handle,String engine, String lights, int wheels, int seats, int fuelTank) {
        super(engine,lights,wheels,seats,fuelTank);
        this.handle = handle;
    }

    //Getter
    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike [ getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
                + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
                + "]";
    }
    public void run() {
        System.out.println("Running bike");
        System.out.println(toString());
    }
}


