package gettingStarted;
import java.util.*;
public class gradingSystem {
   



  public static void main(String[] args) {
    // input - don't change this code
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();
    if(marks > 90) {
        System.out.println("excellent");
        }else if(marks > 80){
          System.out.println("good");       
        }else if(marks > 70){
                 System.out.println("fair");
        }else if(marks > 60){
                 System.out.println("meets expectations");
        }else {
                 System.out.println("below par");
            
        }
    
  
  }
}
