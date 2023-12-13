package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        //int x = 3;

        /**
         if (x == 1) {
         System.out.println("The value of x is 1");
         }else if(x == 2){
         System.out.println("The value of x is 2");
         }else if (x == 3){
         System.out.println("The value of x is 3");
         }else{
         System.out.println("The value of x is other than 1,2,3");
         }
         **/
        /**
        switch (x) {
            case 1:
                System.out.println("The value of x is 1");
                break;
            case 2:
                System.out.println("The value of x is 2");
                break;
            case 3:
                System.out.println("The value of x is 3");
                break;
            default:
                System.out.println("The value of x is other than 1,2,3");
                break;
        }
         **/
        /**
        char x = 'B';
        switch (x) {
            case 'a':
            case 'A':
                System.out.println("The value of x is a");
                break;
            case 'b':
            case 'B':
                System.out.println("The value of x is b");
                break;
            case 'c':
            case 'C':
                System.out.println("The value of x is c");
                break;
            default:
                System.out.println("The value of x is other than a,b,c");
                break;
        }
         **/
        String name = "AUSTRALIA";
        switch (name.toLowerCase()){
            case "india":
                System.out.println("M S Dhoni");
                break;
            case "united states of america":
                System.out.println("UTD");
                break;
            case "australia":
                System.out.println("Breet lee");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
