package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Area of rectangle with length = 5.4 "
                + "and width = 3.2 = "
                + areaOfRectangle(5.4,3.2));
        //areaOfRectangle(5.4,3.2);

    }
    //to calculate we need length and width
    public static double areaOfRectangle(double length, double width){

        return length* width;
    }
}
