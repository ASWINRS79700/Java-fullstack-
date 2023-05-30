package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new StringFinder().getInput();
        //Get three strings from the user
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String searchstring=scanner.nextLine();
        String firstString=scanner.nextLine();
        String secondString=scanner.nextLine();
        scanner.close();
        int r=findString(searchstring,firstString,secondString);
        displayResult(r);


        return null;
    }

    public void displayResult(int result) {
        if(result==1)
            System.out.println("foundasexpected");
        else if(result==0)
            System.out.println("notfound");
        else if (result==-1)
            System.out.println("emptystringornull");
        //displays the result
    }

    public int findString(String searchString, String firstString, String secondString) {
        if (searchString == null || firstString == null || secondString == null) {
            return -1;
        } else if (searchString.isEmpty() || firstString.isEmpty() || secondString.isEmpty()) {
            return -1;
        } else {
            int pos1 = searchString.indexOf(firstString);
            int pos2 = searchString.indexOf(secondString);
            if (pos1 < pos2 && pos1 != -1 && pos2 != -1) {
                return 1;
            } else
                return 0;


        }
    }
    public void closeScanner() {
        sc.close();


    }

}