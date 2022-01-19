package recursionOnTheWay;
import java.io.*;
import java.util.*;

public class printSubsequence {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       String str = scn.next();
       printSS(str ,"");
    }

    public static void printSS(String que, String ans) {
        if(que.length() == 0){
            System.out.println(ans);
            return ;
        }
        char ch = que.charAt(0);
        String roq = que.substring(1);
        printSS(roq, ans + ch);
        printSS(roq, ans + "");
    }

}
