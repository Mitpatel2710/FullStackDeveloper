package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        int x = 10;
        /**
         if (x == 5) {
         if (x >= 5) {
         System.out.println("Condition is true");
         } else {
         System.out.println("Condition is false");
         }
         }
         **/

        if(x == 5){
            System.out.println("x equal to 5");
        }else if (x>=5){
            System.out.println("x is greater than 5");
        }else{
            System.out.println("x is smaller than 5");
        }
    }
}
