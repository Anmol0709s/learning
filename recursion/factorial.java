package recursion;


import java.util.*;

public class factorial {

    public static void main(String[] args) throws Exception {
        try (Scanner scn = new Scanner(System.in)) {
            int  n = scn.nextInt();

            int  f = factorial(n);
            System.out.println(f);
        }

    }

    public static int factorial(int n){
    
if(n == 1){
    return 1 ;
}
        int fnm1 = factorial(n - 1);
       int fn = fnm1 * n ;
        return fn;
    }

}
