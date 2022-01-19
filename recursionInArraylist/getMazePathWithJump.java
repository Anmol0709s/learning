package recursionInArraylist;
import java.io.*;
import java.util.*;

public class getMazePathWithJump {

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
        ArrayList<String> path = new ArrayList<>();

        // horizontal path
        for(int ms = 1 ; ms <= dc - sc ; ms++){
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms , dr , dc);
            for(String hpath : hpaths){
                path.add("h" + ms + hpath);
            }
        }

            // vertical path
               for(int ms = 1 ; ms <= dr - sr ; ms++){
            ArrayList<String> vpaths = getMazePaths(sr + ms , sc , dr , dc);
            for(String vpath : vpaths){
                path.add("v" + ms + vpath);
            }
               }
            //diagonal path
               for(int ms = 1 ; ms <= dc - sc && ms <= dr - sr ; ms++){
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms , dr , dc);
            for(String dpath : dpaths){
                path.add("d" + ms + dpath);
            }
               }
            return path;
        
    }
}

