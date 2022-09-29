package org.example;


public class FizzBuzz {
    public static void main(String[] args) {

        System.out.println(fizzbuzz(5));
    }

    public static String fizzbuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FIZZBUZZ";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

}