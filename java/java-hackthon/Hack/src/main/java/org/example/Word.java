package org.example;

import java.io.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Word {
    Map<String, Integer> words
            = new HashMap<String, Integer>();
    String fileName="daffodils.txt";

    public Map<String, Integer> getWords() {

        return words;
    }

    public void setWords(Map<String, Integer> words) {

        this.words = words;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {

        this.fileName = fileName;
    }

    public Map<String,Integer>getWords(String fileName) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File(fileName));


        while (file.hasNext()) {

            String word = file.next();

            Integer count = words.get(word);

            if (count != null) {
                count++;
            }
            else


                count = 1;
            this.words.put(word, count);

        }

        file.close();
        System.out.println(words);
        return words;
    }
    public  Map<String,Integer> sortByKey(Map words)
    {

        TreeMap<String, Integer> sorted = new TreeMap<>(words);
        words=sorted;
        System.out.println(words);
        return  words;
    }
    public void reverse(Map words){
    Set<String> keyR= words.keySet();

    List<String>key=new ArrayList<>();
        for (String s:keyR
             ) {
            key.add(s);
        }


    int l=keyR.size();
    for(int i=l-1;i>0;i--){
        System.out.println(key.get(i)+" - "+words.get(key.get(i)));

    }
    }
    public Map<String, Integer> showFrequentWords(Map ascdsort) {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(ascdsort.entrySet());
        System.out.println(list);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    }
