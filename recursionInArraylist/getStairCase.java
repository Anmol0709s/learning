package recursionInArraylist;
import java.io.*;
import java.util.*;

public class getStairCase {

    public static void main(String[] args) throws Exception {
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  ArrayList<String> steps = getStairPaths(n);
  System.out.println(steps);
    }

    public static ArrayList<String> getStairPaths(int n) {
    if(n == 0){
        ArrayList<String> bc = new ArrayList<>();
        bc.add("");
        return bc;
    } else if(n < 0){
        ArrayList<String> bc = new ArrayList<>();
        return bc;
    }
    ArrayList<String> paths1 = getStairPaths(n - 1);
    ArrayList<String> paths2 = getStairPaths(n - 2);
    ArrayList<String> paths3 = getStairPaths(n - 3);

    ArrayList<String> paths = new ArrayList<>(); 
    for(String root : paths1){
        paths.add(1 + root);
    }
     for(String root : paths2){
        paths.add(2 + root);
    }
     for(String root : paths3){
        paths.add(3 + root);
    }
    return paths;
    }

}
