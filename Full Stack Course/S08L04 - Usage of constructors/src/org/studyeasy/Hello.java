package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        Car car = new Car();
        //if you uncomment below line then it will give you running output if you uncomment it uses
        // parametrise constructor
        //Car car = new Car("closed", "on","seated",10);// object of the car

        //car.setSpeed(10);
        //System.out.println(car.getSpeed());

        //car.setDoors("Closed");
        //System.out.println(car.getDoors());

        // car.setDoors("closed");
        // car.setDriver("seated");
        // car.setEngine("on");
        // car.setSpeed(10);


        System.out.println(car.run());

    }
}
