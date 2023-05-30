package com.stackroute.basics;




import java.util.Scanner;
public class SortAscNumber {
   int n;
    String res="";

    public static void main(String[] args) {

        new SortAscNumber().getNumbers();
    }

    //get the numbers from user through console
    public void getNumbers() {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int n4 = scan.nextInt();
        System.out.println(numberSorter(n1, n2, n3, n4));


    }

    //logic to sort the numbers
    public String numberSorter(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {



        String in="Sorted:{";
        for(int i=0;i<4;i++){
            if (firstNumber > secondNumber) {
                if (firstNumber > thirdNumber) {
                    if (firstNumber > fourthNumber) {
                        n = firstNumber;
                        firstNumber = -10000;

                    } else {
                        n = fourthNumber;
                        fourthNumber = -10000;
                    }
                } else {
                    if (thirdNumber > fourthNumber) {
                        n = thirdNumber;
                        thirdNumber = -10000;
                    } else {
                        n = fourthNumber;
                        fourthNumber = -10000;
                    }
                }
            } else if (secondNumber > firstNumber) {
                if (secondNumber > thirdNumber) {
                    if (secondNumber > fourthNumber) {
                        n = secondNumber;
                        secondNumber = -10000;
                    } else {
                        n = fourthNumber;
                        fourthNumber = -10000;
                    }
                } else {
                    if (thirdNumber > fourthNumber) {
                        n = thirdNumber;
                        thirdNumber = -10000;
                    } else {
                        n = fourthNumber;
                        fourthNumber = -10000;
                    }
                }
            } else if (thirdNumber > firstNumber) {
                if (thirdNumber > secondNumber) {
                    if (thirdNumber > fourthNumber) {
                        n = thirdNumber;
                        thirdNumber = -10000;
                    } else {
                        n= fourthNumber;
                        fourthNumber = -10000;
                    }
                } else {
                    if (secondNumber > fourthNumber) {
                        n = secondNumber;
                        secondNumber = -10000;
                    } else {
                        n = fourthNumber;
                        fourthNumber = -10000;
                    }
                }
            } else if (fourthNumber > firstNumber) {
                if (fourthNumber > thirdNumber) {
                    if (fourthNumber > secondNumber) {
                        n = fourthNumber;
                        fourthNumber = -10000;

                    } else {
                        n= secondNumber;
                        secondNumber = -10000;
                    }
                } else {
                    if (thirdNumber > secondNumber) {
                        n = thirdNumber;
                        thirdNumber = -10000;
                    } else {
                        n = secondNumber;
                        secondNumber = -10000;

                    }
                }

            }
            if(i!=0) {
                res = n+","+res;
            }
            else{
                res=n+"";
            }
        }


        return in+res+"}";

    }


}

