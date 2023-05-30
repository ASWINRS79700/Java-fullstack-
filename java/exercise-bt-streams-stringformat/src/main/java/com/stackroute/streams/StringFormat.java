package com.stackroute.streams;
import java.util.List;
import java.util.stream.Collectors;
public class StringFormat {
    public String findStringFormat(List<Integer> input) {
        if (input == null || input.isEmpty()) {
            return "Give proper input not empty list";
        }
        if (input.stream().anyMatch(i -> i < 0)) {
            return "Give proper input not negative values";
        }
        return input.stream()
                .map((num)->num%2==0?"even"+num:"odd"+num)
                .collect(Collectors.joining(","));
    }
}