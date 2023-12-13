package org.studyeasy;

public class Car {
    //if name of the method and name of the class is same then it is called constructor
    //constructor doesnt have any return type

    private String doors;
    private String engine;
    private String driver;
    private int speed;

    // value assigned to constructor
    public Car(){
        doors = "opened";
        engine = "off";
        driver = "absent";
        speed  = 10;
    }

    //Constructor
    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public String getDoors() {
        return doors;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String run() {
        if (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
            return "Running";
        } else {
            return "Not running";
        }
    }
}
