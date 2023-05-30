package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fun {
    List<String> stringList=new ArrayList<>();
    public int count(List<String> list){
        int c=0;
        for (String str:list
             ) {
            if(str.startsWith("H")){
                c++;
            }
        }
        return c;
    }
}
