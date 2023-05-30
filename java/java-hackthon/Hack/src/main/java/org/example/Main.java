package org.example;

import java.io.FileNotFoundException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Word w=new Word();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Map<String, Integer>words= w.getWords("C:\\Users\\245252\\training\\JAVA\\java-hackthon\\data\\daffodils.txt");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        w.reverse(words);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        words=w.showFrequentWords(words);

    }
}