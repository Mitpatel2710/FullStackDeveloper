package org.studyeasy;

// whenever you run the code uncomment Bike if you are running using Bike object
//whenever you run the code uncomment Truck if you are running using Truck object
//import org.studyeasy.vehicles.Truck; - for truck object
//import.org.studyeasy.vehicles.Bike - for bike object

import org.studyeasy.vehicles.Bike;

public class Demo {
    public static void main(String[] args) {

//        Bike bike = new Bike();
//        System.out.println(bike.getHandle());
//        System.out.println(bike.getEngine());
//        System.out.println(bike.getWheels());

        Bike bike = new Bike("short","petrol", "LED",2,2,20);
//        System.out.println("Handle: "+bike.getHandle());
//        System.out.println("Engine type: "+bike.getEngine());
//        System.out.println("Number of seats: "+bike.getSeats());
//        System.out.println("Number of wheels: "+bike.getWheels());
//        System.out.println("Fuel tank capacity: "+bike.getFuelTank());
//        System.out.println("Head lamp type: "+bike.getLights());

//        System.out.println(bike);
//        bike.run();
       bike.run();

//      Truck truck = new Truck("Circle", "High", "Good",60);
//      System.out.println(truck);
//      truck.run();


    }
}

//Overriding is the custom version of the functionality which is provided by parent class
//And what is overriding, we are simply implementing a custom version of the functionality which is provided
// by other parent class.
//So whenever we are like implementing some customized version of our own method, that is nothing but
//our overriding part.