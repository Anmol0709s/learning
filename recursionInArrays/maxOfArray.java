package recursionInArrays;


import java.util.*;

public class maxOfArray {

    public static void main(String[] args) throws Exception {
        
     try (Scanner scn = new Scanner(System.in)) {
        int n  = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = scn.nextInt();
        }

        int max = maxOfArray(arr , 0);
  System.out.println(max);
    }
            }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1){
            return idx;
        }
        int mis = maxOfArray(arr , idx + 1);
        if(mis > arr[idx]){
            return mis;
        } else{
            return arr[idx];
        }
    
    
    }

}
