package qstn2;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a1[]= {2, 5, 2, 6, 9};
        int a2[]= {3, 7, 3, 1, 2};
        winRound(a1,a2);
        int a3[]={4, 3, 4, 4, 5};
        int a4[]={3, 2, 5, 4, 1};
        winRound(a3,a4);
        // sample 1 returns true
        // Your cards can make the number 96
        // Your opponent can make the number 73
        // You win the round since 96 > 73
        // sample 2 returns false
        // both you and your opponent makes the
        // number 54 hence false is returned
    }
    public static void winRound(int[] a1, int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        int n1,n2,n=2,l1= a1.length-1, l2=a2.length-1;
        n1= a1[l1];
        n1=n1*10+ a1[l1-1];
        n2= a2[l2];
        n2=n2*10+ a2[l2-1];
        if(n1!=n2){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}