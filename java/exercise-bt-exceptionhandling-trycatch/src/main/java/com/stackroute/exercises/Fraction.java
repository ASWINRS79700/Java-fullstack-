package com.stackroute.exercises;


public class Fraction {
    //Write logic to calculate the fraction and return as a String
    public String fractionCalculator(int firstNumber, int secondNumber) {
        try {
            int div = firstNumber / secondNumber;
            return (Integer.toString(div));
        } catch (ArithmeticException e) {
            return ("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}
