package recursionInArraylist;
import java.io.*;
import java.util.*;

public class getMazePath {

    public static void main(String[] args) throws Exception {
 Scanner scn = new Scanner(System.in);
 int n = scn.nextInt();
 int m = scn.nextInt();

 ArrayList<String> path = getMazePaths(1, 1, n, m);
 System.out.println(path);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       if(sr == dr && sc == dc){
           ArrayList<String> bc = new ArrayList<>();
           bc.add("");
           return bc;
       } 
       
       ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sc < dc){
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpaths = getMazePaths(sr + 1, sc , dr, dc);
        }

        ArrayList<String> path = new ArrayList<>();
        for(String hpath : hpaths){
            path.add("h" + hpath);
        }
        for(String vpath : vpaths){
            path.add("v" + vpath);
        }
        return path ;
    }

}



