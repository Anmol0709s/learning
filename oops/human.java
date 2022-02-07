package oops;
public class human {
   int age;
   String name;
   int salary;
   boolean married;  
    static long population ; // static vha pr use hota h jo default ho mtlb vo variable jo  sabke liye
                            //  hota isliye ye class k sath hokr kaam krta.
                        
    static void message(){
    System.out.println("hello duniya");
   //   System.out.println(this.age); -> cannot use this over here 
   
}

public human(int age , String name, int salary, boolean married ) {
    this.age = age;
    this.name  = name;
    this.salary = salary;
    this.married = married;

    human.population += 1;

    human.message();
}


}
