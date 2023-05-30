package com.stackroute.collections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSort {

    //write logic to sort given list in descending order
    public ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> list) {
        Comparator obj =new res();
        list.sort(obj);
        return list;
    }
    public class res implements Comparator<BigInteger>{
        @Override
        public int compare (BigInteger i,BigInteger j) {
            return j.compareTo(i);
        }
    }
}







