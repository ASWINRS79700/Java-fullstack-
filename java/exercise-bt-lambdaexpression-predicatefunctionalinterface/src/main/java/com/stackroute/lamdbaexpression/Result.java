package com.stackroute.lamdbaexpression;

public class Result {
    public Cube findCube = (a) -> a * a * a;
    Changecase changecase = (str) -> {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return String.valueOf(result);
    };
}
