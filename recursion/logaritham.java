package recursion;

import java.io.*;
import java.util.*;

public class logaritham {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xl = power(x ,n );
        System.out.println(xl);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xbt = power(x ,n/2);
        int xt = 0;
        if(n % 2 == 0){
            xt = xbt * xbt;
        } else {
            xt = xbt * xbt * x;
        }
        return xt;
    }

}
