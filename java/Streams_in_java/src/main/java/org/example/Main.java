package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> li=new ArrayList<>();
        li.add(100);
        li.add(3);
        li.add(4);
        li.add(4);
        li.add(4);
        li.add(7);
        li=li.stream().filter(n->n%2==0).distinct().collect(Collectors.toList());
        System.out.println(li);
    }
}