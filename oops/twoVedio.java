package oops;

public class twoVedio {
     public static void main(String[] args) {
      
      Integer a = 10;
        Integer b = 20 ;
        
        // Integer num = 10;
        
     final   A anmol = new A("nmo");

           anmol.name = "joker";

// when a non primitive is finali-ise you cannot reassign it
        //    anmol = new A("other name");


       swap(a , b);
    //    final int bonus = 2;
    //    bonus = 3;
 A obj = new A("snncdhccsxjsdc");
System.out.println(obj);

//  for (int i = 0; i < 1000000000; i++) {
//      obj = new A("Randaom names");
//  }
//       System.out.println(a + " " + b);
}

  static void swap(Integer a , Integer b){
   Integer temp = a;
   a = b;
   b  = temp;
  }

}
class A{
    final int  num = 10;
    String name;
    public A(String name){
    //     System.out.println("objectt is bann gya h");
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // System.out.println("object ki  ass tear hogyi");
    }
}

