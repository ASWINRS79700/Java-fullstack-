package org.example;

public class Main {
    public static void main(String[] args) {

        String str="1234";
        int n=str.length(),n1=0,n2=0;
        if(n%2==0){
                for (int i=0;i<n/2;i++){
                    n1=str.charAt(i)-'0';
                    System.out.println(n1);

                }
                for(int i=n/2;i<n;i++){

                    n2=n2+str.charAt(i);
                    System.out.println(n2);

                }
        }
        else{
            for (int i=0;i<n/2;i++){
                n1=n1+str.charAt(i);
                System.out.println(str.charAt(i)+" "+n1);

            }
            for(int i=n/2+1;i<n;i++){

                n2=n2+str.charAt(i);
                System.out.println(str.charAt(i)+" "+n2);

            }

        }
        System.out.println(n1);
        System.out.println(n2);

    }
}