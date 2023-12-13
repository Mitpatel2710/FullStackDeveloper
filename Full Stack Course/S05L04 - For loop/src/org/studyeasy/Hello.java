package org.studyeasy;

public class Hello {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
        for (int i = 50; i >= 1; i--) {
            System.out.println("The value of i: " + i);
        }
        int num = 25;
        boolean Prime = true;
        for (int j = 2; j <= num / 2; j++) {
            if (num % j == 0) {
                Prime = false;
            }
        }
        if (Prime == true) {
            System.out.println("The num is prime ");
        } else {
            System.out.println("The num is not prime");
        }
    }
}
