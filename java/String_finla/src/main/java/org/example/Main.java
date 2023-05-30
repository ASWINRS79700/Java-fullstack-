package org.example;

public class Main {
    public static void main(String[] args) {

        String str="codeleet",res="";
        int [] n={4,5,6,7,0,1,2,3};
        for(int i=0;i<n.length;i++){
            res=res+str.charAt(n[i]);
        }
        System.out.println(res);
    }
}