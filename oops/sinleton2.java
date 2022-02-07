package oops;
import oops.acess1;
public class sinleton2 {
   
    public static void main(String[] args) {
        singleton obj1 =  singleton.getInstance();
        
        singleton obj2  =  singleton.getInstance(); 
        
        singleton obj3  =  singleton.getInstance(); 
        acess1 a = new acess1(12, "Anmol");
        a.getNum();
    }
}
