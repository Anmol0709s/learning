package oops;
public class acess1 {
      int num ;
      String name;
      int[] arr;
    

      public int getNum(){
          return num;
      }
public void setNum(int num){
this.num = num;
}
 public acess1(int num , String name) {
     this.num = num;
     this.name = name;
     this.arr = new  int[num];
 }     
}
