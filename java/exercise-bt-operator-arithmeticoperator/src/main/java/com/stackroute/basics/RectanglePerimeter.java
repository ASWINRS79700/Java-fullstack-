package com.stackroute.basics;
import java.util.Scanner;


public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
    Scanner scan=new Scanner(System.in);

    double length=scan.nextDouble();
    double breadth=scan.nextDouble();
     length=perimeterCalculator(length,breadth);
     System.out.println(length);
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {

        return (length+breadth)*2;
    }
}
