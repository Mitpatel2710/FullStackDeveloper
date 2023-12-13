package org.studyeasy;
//In method overloading method name can be the same but parameter should be different
public class Hello {
    public static void main(String[] args) {
        System.out.println("Area of rectangle: "+ area(13.42d,9.34d));
        System.out.println("Area of square: "+ area(5.0));
    }
    //area method is having two parameter
    public static double area(double length, double width) {

        return length*width;
    }
    //same area method with one parameter with double as datatype
    public static double area(double side) {

        return side*side;
    }
    //same area method with one parameter with int as datatype
    public static int area(int side) {

        return side*side;
    }
}
