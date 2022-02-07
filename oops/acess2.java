package oops;



// with protected in different packages you will only able to acess it in subclasses.



public class acess2 extends acess1 {
    public acess2(int num, String name) {
        super(num, name);
        
    }

    public static void main(String[] args) {
        acess1 obj = new acess2(10 ,"Anmol" );
    
        // need to do few thing
        //1. acess  the data members
        //2.modify the data member


    //     ArrayList<Integer> list = new ArrayList<>(); 
    //     obj.getNum();
    //  int n =   obj.num;
      
    
    //String r = obj.un; --  acess3 ka nnhi aa sakta h
    }
}

 class acess3 extends acess2 {
protected String un;

    public acess3(int num, String name) {
        super(num, name);
        
    }

    public static void main(String[] args) {
        acess3 obj = new acess3(10 ,"Anmol" );
    
        // need to do few thing
        //1. acess  the data members
        //2.modify the data member
      //  ArrayList<Integer> list = new ArrayList<>(); 
        obj.getNum();
     int n =   obj.num;
    }
}

