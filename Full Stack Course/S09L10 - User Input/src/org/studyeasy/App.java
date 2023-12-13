package org.studyeasy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        System.out.println("Your age is: " + age);

    }
}