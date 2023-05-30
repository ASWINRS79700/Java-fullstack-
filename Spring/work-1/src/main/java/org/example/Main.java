package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creating a List
        List<String> list=new ArrayList<String>();
        //Adding elements in the List
        list.add("Hango");
        list.add("Apple");
        list.add("Hanana");
        list.add("Grapes");
        Fun fun=new Fun();
        System.out.println(fun.count(list));;
    }
}