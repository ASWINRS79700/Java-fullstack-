package org.example;

public class Calculator {
    public int add(int a,int b){

            return a + b;

    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b)throws IIException{
        if(a==0){
             throw new IIException("Zero can't be divide");
        }
        return a/b;
    }


}
