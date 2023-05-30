package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> words=new HashMap<>();
        Map<String,Integer> wor=new LinkedHashMap<>();
        Words w=new Words();
        w.insert("aswin",1);
        w.insert("abhay",2);
        w.insert("luxmin",3);
        words=w.insert("abhijith",4);
        System.out.println(words);
        List <Map.Entry<String,Integer>> lm=new ArrayList<>(words.entrySet());
        List <Map.Entry<String,Integer>> lr=new ArrayList<>(words.entrySet());

        Collections.sort(lm, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        Collections.sort(lr, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println(lr);
        System.out.println(lm);
        words.clear();
        for (Map.Entry<String,Integer> aa:lm
             ) {
            System.out.println(aa.getKey()+" "+aa.getValue());
            wor.put(aa.getKey(), aa.getValue());
        }
        System.out.println(wor);

    }
}