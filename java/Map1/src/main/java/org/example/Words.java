package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Words {
    Map<String,Integer> wods=new HashMap<String,Integer>();

    public Map<String, Integer> getWods() {
        return wods;
    }

    public void setWods(Map<String, Integer> wods) {
        this.wods = wods;
    }

    public Map<String,Integer> insert(String s, Integer n){
        wods.put(s,n);
        return wods;
    }



}
