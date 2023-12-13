package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        Car car = new Car("closed", "on","seated",10);// object of the car
        System.out.println(car.run());
        //car.setSpeed(10);
        //System.out.println(car.getSpeed());

        //car.setDoors("Closed");
        //System.out.println(car.getDoors());

        // car.setDoors("closed");
        // car.setDriver("seated");
        // car.setEngine("on");
        // car.setSpeed(10);


    }
}
