package com.stackroute.lamdbaexpression;
import java.util.*;
import java.util.function.Predicate;
public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
        Predicate<String> stringPredicate = str -> str.startsWith("I");
        Set <String> outputSet= new LinkedHashSet<>();
        for (String str : list) {
            if(stringPredicate.test(str)){
                outputSet.add(str);
            }
        }
        List <String> outputList = new LinkedList<>(outputSet);
        return outputList;
    }
}
