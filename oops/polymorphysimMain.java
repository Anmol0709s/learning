package oops;

public class polymorphysimMain {
    public static void main(String[] args) {
     polymorphysimShape shape = new polymorphysimShape();
     polymorphysimShape circle = new polymorphysimCircle();
     polymorphysimSquare square = new polymorphysimSquare();
     // type of method in overriding is depend on  what the type of object is....
     circle.area();
    }
}
// DYNAMIC MECHANISM DISPATCH -- it is just a mechanism by which a call to an overridden method
//                               is resolve  at runtime rather then compile time
