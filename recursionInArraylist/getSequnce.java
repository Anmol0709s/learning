package recursionInArraylist;

import java.io.*;
import java.util.*;

public class getSequnce {

    public static void main(String[] args) throws Exception {
Scanner scn = new Scanner(System.in);
String str = scn.next();
ArrayList<String> res = gss(str);
System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
    if(str.length() == 0){
        ArrayList<String> bc = new ArrayList<>();
        bc.add("");
        return bc;
    }
    
    
    char ch = str.charAt(0);

    String ros =  str.substring(1);
    ArrayList<String> rres = gss(ros);

ArrayList<String> mres = new ArrayList<>();
    for(String r : rres){
     mres.add("" + r);
    }
       for(String r : rres){
     mres.add(ch + r);
    }
    return mres;
    }

}
