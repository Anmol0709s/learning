package oops;

public class inheritanceTopic2 {
    public static void main(String[] args) {
        inheritanceTopic box1 = new inheritanceTopic(4.6 , 8.0 , 88.7);
        inheritanceTopic box2 = new inheritanceTopic(box1);
   // System.out.println(box2.l + " " + box2.h + " " + box2.w);

    // inheritanceTopic3 box3 = new inheritanceTopic3();
// inheritanceTopic3 box4 = new inheritanceTopic3(3 , 5 ,8 , 9);
// System.out.println(box3.h + " " + box3.weight);    

// inheritanceTopic box5 = new inheritanceTopic3(1 , 7 , 6 , 5);
//System.out.println(box5.weight); it is important to undertand that it is  actually the type of the
// reference varaible not the type of the object  that  determines what member have to acess 
// System.out.println(box5.w);

// there r many varaibles in both parent and child classes
// u r given acess to variables that r in the reference type i.e.,  inheritanceTopic3 
// hence, you should have acess to weight variable
// thisn also means that once you r trying to access should be initialise
// but here when the object itself is of the type parent class then how will you call the constructor of child class
// this is why error

// inheritanceTopic3 box6 = new inheritanceTopic3(1 , 7 , 6, 5);
// System.out.println(box6.l);

// inheritanceTopic4 box = new inheritanceTopic4( 78 , 4 , 67);
// System.out.println(box.l + " " + box.weight + " " + box.price);

// box1.greetings(); 

inheritanceTopic3 box = new inheritanceTopic3();// static methods can be inherited but cannot be overriden
inheritanceTopic3.greetings();
}
}
