package third;

import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a1[]= {2, 8, 4, 1};
        int a2[]= {-1, -10, 1, -2, 20};
        int a3[]={-1, -20, 5, -1, -2, 2};
        canPartition(a1) ;// true => 8 = 2 X 4 X 1

        canPartition(a2) ;// false

        canPartition(a3) ;// true



    }
    public static void canPartition(int[] a){
        int pro=1;
        for (int element:a
             ) {
            pro=pro*element;
        }
        for (int element:a
             ) {
            if(pro/(element*element)==1){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
        return;

    }
}