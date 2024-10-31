package org.SergiFactoriaF5;

public class Fizzbuzz {
    public String checkNumber( int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        if(number % 3 == 0 && number % 5 == 0){
            return"FizzBuzz";
        }
        return null;
    }
}


