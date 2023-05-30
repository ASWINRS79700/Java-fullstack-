package com.stackroute.commonjavaclasses;


public class ISBNValidator{
    public int validateISBNNumber (String val){
        if(val.isEmpty()||val==null){
            return -1;
        }
        int v=0,j=10;
        char []s=val.toCharArray();
        for(int i=0;i<s.length;i++){
            int n=s[i]-'0';
            if(n>=0&&n<=9){
                v=v+n*j;
                j--;
            }
            else{
                throw new NumberFormatException("Method throws exception when input string is not a proper number");
            }
        }
        if(v%11==0){
            return 1;
        }
        else {
            return 0;
        }
    }}

