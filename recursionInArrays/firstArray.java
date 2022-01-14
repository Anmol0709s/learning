package recursionInArrays;

import java.util.*;

public class firstArray {

    public static void main(String[] args) throws Exception {
     try (Scanner scn = new Scanner(System.in)) {
        int n  = scn.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();

         int jj =  firstIndex(arr , 0 , x);
      System.out.println(jj);
    }
    
    }

    public static int firstIndex(int[] arr, int idx, int x){
    if(idx == arr.length ){
        return -1;
    }
  if(arr[idx] == x){
    return idx ;
    } else{
        int kk = firstIndex(arr , idx + 1 , x);
        return kk;
    }
    
    }

}
