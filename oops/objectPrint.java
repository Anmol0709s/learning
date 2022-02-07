package oops;

public class objectPrint extends Object {

    int num ;
    public objectPrint(int num){
        this.num = num;
    }
    @Override
    public  String toString() {
       
        return  "objectPrint{" +
        "num " + num +
        '}' ;
    }
   public static void main(String[] args) {
       objectPrint obj = new objectPrint(54);

       System.out.println(obj);
   }  
}
