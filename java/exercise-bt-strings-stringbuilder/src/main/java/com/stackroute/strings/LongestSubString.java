package com.stackroute.strings;

public class LongestSubString {

    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {
        int l=input.length(),c=0,e,flag=0,i;
        e=l-1;
        StringBuilder res=new StringBuilder();
        if(l==1){
            return input;
        }
        for(i=l-2;i>0;i--){

            while(input.charAt(i)==input.charAt(e)){
                res.append(input.charAt(i));

                i--;
                e--;
                c++;

                if(i<0){
                    flag=1;

                    break;
                }

            }
            if(flag==1){
                break;
            }
            if(c!=0&&i!=0){
                i++;
                e=l-1;
                c=0;
                res.setLength(0);
            }
            else{
                e=l-1;
                c=0;
                res.setLength(0);
                }
             }
        if(flag==1){
            return res.reverse();
        }
        else{
            return res.append("Longest substring is not present in the given StringBuilder");
        } }
}
