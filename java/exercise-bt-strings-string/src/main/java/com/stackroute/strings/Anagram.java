package com.stackroute.strings;

import java.util.Arrays;
import java.util.Locale;


public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if (phraseOne.isEmpty() || phraseTwo.isEmpty())
            return "Give proper input not empty phrases";
        char[] chr1 = phraseOne.toCharArray();
        char[] chr2 = phraseTwo.toCharArray();
        Arrays.sort(chr1);
        Arrays.sort(chr2);
        phraseOne= Arrays.toString(chr1);
        if (Arrays.equals(chr1, chr2)) {
            return "Given phrases are anagrams";
        } else {
            return "Given phrases are not anagrams";
        }
    }
}