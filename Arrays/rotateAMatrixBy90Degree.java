package Arrays;


    import java.io.*;
import java.util.* ;
public class rotateAMatrixBy90Degree {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        //tranpose
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i; j < arr[0].length ; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
            }
        }
       for(int i = 0 ; i < arr.length ; i++){
       int le = 0;
       int ri = arr[i].length - 1 ;

       while(le < ri){
         int temp = arr[i][le] ;
         arr[i][le] = arr[i][ri];
         arr[i][ri] = temp;
         
         
         
           le++ ;
           ri-- ;


       }
       }
display(arr) ;
    }
    
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

