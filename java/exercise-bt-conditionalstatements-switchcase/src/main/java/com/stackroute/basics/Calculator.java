package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        //System.out.println("Enter the first number:");
        String j;
        int n = 0, m =0, op = 0;

        do {


             n = scan.nextInt();
             m = scan.nextInt();
             op = scan.nextInt();

            j = scan.next();

        } while (j.equals("y"));
        System.out.println(calculate(n, m, op));

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        int res;
        switch (operator) {
            case 1:
                res = (firstValue + secondValue);
                return firstValue + " + " + secondValue + " = " + res;
            case 2:
                res = (firstValue - secondValue);
                return firstValue + " - " + secondValue + " = " + res;
            case 3:
                res = (firstValue * secondValue);
                return firstValue + " * " + secondValue + " = " + res;
            case 4:
                if (secondValue < 1)
                    return "The divider (secondValue) cannot be zero";
                res = (firstValue / secondValue);
                return firstValue + " / " + secondValue + " = " + res;
            default:
                return "Entered wrong option " + operator;
        }

    }
}
