package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        if(x && y) {
            System.out.println("Condition is True");
        }else{
            System.out.println("Condition is False");
        }
        if(x || y) {
            System.out.println("Condition is True");
        }else{
            System.out.println("Condition is False");
        }

        int ageOfBoy = 21;
        int ageOfGril = 18;
        if(ageOfGril<ageOfBoy){
            System.out.println("They are eligible to get married");
        }else{
            System.out.println("They are not eligible to get married ");
        }
    }
}
