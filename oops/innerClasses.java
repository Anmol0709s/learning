package oops;

// out classes cannot be static 
public  class innerClasses {
 
    // but inner CLASSES can be static
  static   class test {
  String name;
  
      public test(String  name){
          this.name = name;
      
      
      }
      @Override
      public String toString() {
          
          return name;
      }
      }
 
    public static void main(String[] args) {
        test a  = new test("Anmol");
        test b  = new test("Shivalika");


        System.out.println(a);
        // System.out.println(a.name);
        // System.out.println(b.name);
    }
}
// outside classes cannot be static 
// static class f {

// }