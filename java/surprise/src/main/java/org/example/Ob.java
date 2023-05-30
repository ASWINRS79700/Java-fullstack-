package org.example;

public class Ob {
    public int find(int n,int m,int a[]){
        int l=Integer.toString(n).length();
        int flag=0;
        int q=n*10;
        while(n<q){
            int p=n;
            while(p>0){
                int k=p%10;
                p=p/10;
                for(int i=0;i<m;i++){
                    if(k==a[i]){
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                    break;
                }
            }
            if(flag==0){
                return n;
            }
            else{
                n++;
                flag=0;
            }
        }
        return 0;
    }
}
