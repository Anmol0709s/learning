package recursionOnTheWay;
import java.util.Scanner;
public class printMazeWithjump {
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    printMaze(1, 1, n, m, "");

}
public static void printMaze(int sr , int sc ,int dr , int dc , String psf){
if(sr== dr && sc == dc){
    System.out.println(psf);
    return ;
}
    for(int ms = 1 ; ms <= dc - sc ; ms++){
        printMaze(sr , sc + ms, dr, dc, psf + "h" + ms);
    }
    for(int ms = 1 ; ms <= dr - sr ; ms++){
        printMaze(sr + ms, sc, dr, dc, psf + "v" + ms);
    }
    for(int ms = 1 ; ms <= dc - sc && ms <= dr - sr ; ms++){
        printMaze(sr + ms, sc + ms, dr, dc, psf + "d" + ms);
    }
}
}