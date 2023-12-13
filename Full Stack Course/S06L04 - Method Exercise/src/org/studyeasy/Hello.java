package org.studyeasy;
//calculate the prime number with the method called isPrime
//first create a class
//main
//we need one bool variable to assign prime number
//if condition and print statement if and else (prime or not prime)
//now create method and pass the parameter in int number where number is variable in that parameter
//assign bool variable = true
//now write the logic where if i starts from 2 and i is < number/2 i++
//and if number % i is equal to 0
//variable = false and break
// return isPrime

public class Hello {
    public static void main(String[] args) {
        boolean isPrime = isPrime(7);
        if(isPrime) {
            System.out.println("Input is prime");
        } else {
            System.out.println("Input is not prime");
        }
    }
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number/2; i++) {
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}