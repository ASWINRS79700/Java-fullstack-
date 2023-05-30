package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m= scan.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]= scan.nextInt();
        }
        Ob obj=new Ob();
        int result=obj.find(n,m,a);
        System.out.println("answer is -");
        System.out.println(result);

    }
}