package org.studyeasy;
public class Hello {
    public static void main(String[] args){
        //loop is being called
        loop(1, 10);
        System.out.println("------------------------------");
        loop(20, 40);
        System.out.println("------------------------------");
        loop(1, 5);
        System.out.println("------------------------------");
        loop(10, 30);
        System.out.println("------------------------------");
        loop(25,45);
        System.out.println("------------------------------");
        loop(10, 50);

    }

    //method is created here
    public static void loop(int step, int finalValue) { //int step and int finalValue is parameter
        while (step <= finalValue) {
            System.out.println(step);
            step++;
        }
    }
}

