package oops;

public class humanTwo {
    public static void main(String[] args) {
        // human anmol = new human(20, "molly", 1000000, false);
        // human shivalika = new human(20, "bokku", 100000, false);
        // human shivambhaiya = new human(20, "bokku", 100000, false);
        // System.out.println(anmol.population);
        // System.out.println(shivalika.population);
        // System.out.println(shivambhaiya.population);
    // greeting();

    }
    //this is not dependent on object 
  static void fun(){ 
//    greeting();      // you cant use this because it requires an instance  but the function you r using in it doesnot depends on instances.


// you cannot access non static stuff without referncing thier instances in a static context

//here, i m  referncing it 
  humanTwo kk  = new humanTwo(); 
  kk.greeting();   
  }

   void fun2(){
      greeting();
  }
  
  
    // we know that something which is not static,belongs to object.
 void greeting(){
     fun();
        System.out.println("hello world");
    }
}
