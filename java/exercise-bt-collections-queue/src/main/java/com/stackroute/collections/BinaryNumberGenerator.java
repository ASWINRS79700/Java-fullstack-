package com.stackroute.collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {


        Queue<Integer> q = new LinkedList<>();
        if(input<=0){
            return "Give proper input not zero or negative";
        }
        else if(input>20){
            return "Give proper input not greater than 20";
        }
        else{
            
        }
    }
}