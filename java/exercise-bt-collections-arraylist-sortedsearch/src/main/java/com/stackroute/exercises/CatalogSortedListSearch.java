package com.stackroute.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CatalogSortedListSearch {
    List<String> sortedList = new ArrayList<>();

    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
        if (unSortedCatalogList == null) {
            return "The catalog list is null";
        }
        if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }
        for (String element : unSortedCatalogList) {
            if (element == null || element.isBlank() || element.isEmpty()) {
                return "The catalog List contains empty or null or blank space as a value";
            }
        }
        Collections.sort(unSortedCatalogList);
        sortedList = unSortedCatalogList;
        return sortedList.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return "Input is not accepted";
        } else {
            for (String element : sortedList) {
                if (element.equalsIgnoreCase(value)) {

                    return ("Found: " +element);
                }
            }
        }

        return ("Not Found");
    }
}