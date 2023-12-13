package org.studyeasy;
    /*
        the power of the object oriented programming is pretty simple we can relate the real life senario in
        our programming using objects.
    */
public class Hello {
    public static void main(String[] args) {
        Car car = new Car();// object of the Car class

        car.setSpeed(10);
        System.out.println(car.getSpeed());
        car.setDoors("Closed");
        System.out.println(car.getDoors());

        car.setDoors("closed");
        car.setDriver("seated");
        car.setEngine("on");
        car.setSpeed(10);
        System.out.println(car.run());

        car.setDoors("open");
        car.setDriver("seated");
        car.setEngine("on");
        car.setSpeed(10);
        System.out.println(car.run());
    }
}
