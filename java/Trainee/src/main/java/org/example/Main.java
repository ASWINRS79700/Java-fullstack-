package org.example;

public class Main {
    public static void main(String[] args) {

        Batch b=new Batch(1,"FSD","dec+aug");
        Trainee t=new Trainee("Aswin","TVM",1,b);
        Stream bb=new Stream();
        bb.serializeB(t);
        Trainee tt=bb.deSerialize();


    }
}