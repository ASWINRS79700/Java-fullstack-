
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Prime p=new Prime();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1st and 2nd number....");
        int n=scan.nextInt();
        int m=scan.nextInt();
        p.Fun(n,m);
    }
}
class Prime {
    void Fun(int n, int m) {
        if(n>m){
            int s;
            s=n;
            n=m;
            m=s;}
        for (int i = n; i < m; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }


    }

    boolean isPrime(int i) {
        int c = 0;
        boolean result;
        for (int j = 1; j < i / 2 + 1; j++) {
            if (i % j == 0) {
                c++;
            }
        }
        if (c < 2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

}