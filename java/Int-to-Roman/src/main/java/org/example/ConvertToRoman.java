package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertToRoman {
    public String intToRoman(int num) {
        int n=0;
        String s= String.valueOf(num),res="";
        int l=s.length();
        Integer [] b=new Integer[5];
        b[1]=1;
        b[0]=2;
        b[2]=3;
        b[3]=4;
        b[4]=5;
        List<Integer> s1=Arrays.asList(b);

        List<Integer> val=new ArrayList<>();
        Map<Integer,String> db=new HashMap<>();
        db.put(1,"I");
        db.put(4,"IV");
        db.put(5,"V");
        db.put(9,"IX");
        db.put(10,"X");
        db.put(40,"XL");
        db.put(50,"L");
        db.put(90,"XC");
        db.put(100,"C");
        db.put(400,"CD");
        db.put(500,"D");
        db.put(900,"CM");
        db.put(1000,"M");
        val.add(1000);
        val.add(900);
        val.add(500);
        val.add(400);
        val.add(100);
        val.add(90);
        val.add(50);
        val.add(40);
        val.add(10);
        val.add(9);
        val.add(5);
        val.add(4);
        val.add(1);
val=db.keySet().stream().collect(Collectors.toList());
        System.out.println(val);
        while (num>0){
            if(val.contains(num)) {
                res = res + db.get(num);
                return res;
            }

            if(num>=1000){
                n=num/1000;
                num=num%1000;
                for(int i=0;i<n;i++){
                    res=res+db.get(1000);
                }
            }
            else if(num>=500){
                n=num/500;
                num=num%500;

                for(int i=0;i<n;i++){
                    res=res+db.get(500);
                }
            } else if (num>=100) {
                n=num/100;
                num=num%100;
                for(int i=0;i<n;i++){
                    res=res+db.get(100);
                }
                
            } else if (num>=50) {
                n=num/50;
                num=num%50;
                for(int i=0;i<n;i++){
                    res=res+db.get(50);
                }
            } else if (num>=10) {
                n=num/10;
                num=num%10;
                for(int i=0;i<n;i++){
                    res=res+db.get(10);
                }
            } else if (num>=5) {
                n=num/5;
                num=num%5;
                for(int i=0;i<n;i++){
                    res=res+db.get(5);
                }
            } else if (num>0) {
                n=num/1;
                num=0;
                for(int i=0;i<n;i++){
                    res=res+db.get(1);
                }
            }


        }
        return res;
    }

}
