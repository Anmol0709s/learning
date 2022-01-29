package oops;

public class introduction {
     public static void main(String[] args) {
        

        student molly = new student(24 , "acha  Chuhan" ,  44.5f );
        // student1.rno = 7;
        // student1.name = "Anmol Chauhan";
        // student1.marks = 88.56f;

    //    student ss = new student();
        System.out.println(molly.rno);
        System.out.println(molly.name);
        System.out.println(molly.marks);
        
        // System.out.println(ss.rno);
        // System.out.println(ss.name);
        // System.out.println(ss.marks);

       student random  = new student (molly);
       System.out.println(random.name);
        
        molly.changeName("Anmol");
        molly.greeting();
       
       
}
}
class student{
    int rno ;
    String  name;
    float marks = 90.0f  ;

    // we ned a way to addd the vallues of above properties object by object

    // we neeed one word  to acess every object
 void greeting(){
     System.out.println("hilklo muy name is " + this.name); // whenever  u try to acess a particular item of the class via its object obviously every single item will be specific to that object. greeting and every one will  be different in order to do that we have 'this' variable

 }

 void changeName(String newName) {
     this.name = newName;
 }
 student (student other){
     this.name = other.name;

 }


student (){
    this.rno = 71;
    this.name = "sAnmol Chauhan";  
    this.marks = 88.56f;

}

student (int  rno , String naam , float marks){
    this.rno = rno;
    this.name = naam;  
    this.marks = marks;

}
}



