package com.stackroute.basics;


import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user

    public void getArrayValues() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(findAverage(arr));
    }
    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        int f =0,sum=0;
        if(inputArray.length==0)
            return "Empty array";
        for (int i : inputArray){
            if(i<0){
                f = 1;
                break;
            }
            else {
                sum = sum+i;
            }
        }
        if(f==0)
            return "The average value is: "+sum/inputArray.length;
        else
            return "Give proper positive integer values";
    }
}