package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public List<String> generateCombinations(String number){

        Map<Integer,String> val=new HashMap<>();
        val.put(1,"");
        val.put(2,"abc");
        val.put(3,"def");
        val.put(4,"ghi");
        val.put(5,"jkl");
        val.put(6,"mno");
        val.put(7,"pqrs");
        val.put(8,"tuv");
        val.put(9,"wxyz");
        val.put(0,"");
        int len=number.length(),l=1;
//        for(int i=0;i<len-1;i++){
//            if(number.charAt(i)<='1'){
//                l=l*1;
//            }
//            else if(number.charAt(i)>'1'&&number.charAt(i)<='8'){
//                l=l*3;
//            }
//            else{
//                l=l*4;
//            }
//        }
        List<String> re=new ArrayList<>();

        List<String> res=new ArrayList<>();
        if(len==1){
            int n=number.charAt(0)- '0';
            re.add(val.get(n));
            res.add(re.get(0));
            return res;
        }

        for(int i=0;i<len;i++){
            int n=number.charAt(i)- '0';
            re.add(val.get(n));

        }
        System.out.println(re);
        for(int i=0;i< re.size()-1;i++){
            if(re.get(i).length()==0){
               res.add(re.get(i+1));

               return res;
            }
            else{
                String s1=re.get(i);
                String s2=re.get(i+1);
                for(int j=0;j<s1.length();j++){
                    for(int k=0;k<s2.length();k++){
                        String result=String.valueOf(s1.charAt(j)).concat(String.valueOf(s2.charAt(k)));
                        res.add(result);
                    }
                }
            }
        }
        return res;
    }

}
