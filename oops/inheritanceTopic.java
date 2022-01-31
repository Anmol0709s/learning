package oops;


public class inheritanceTopic {
    double l; 
    double h;
    double w;
    
inheritanceTopic () {
    this.l = -1;
    this.h = -1;
    this.w = -1;
}
//cube
inheritanceTopic(double side){
// super();

    this.l = side;
    this.h = side;
    this.w = side;

}
//normal
public  inheritanceTopic(double h , double l , double w) {
    this.h = h;
    this.l = l;
    this.w = w;
    
}
inheritanceTopic( inheritanceTopic old){
    this.l = old.l;
    this.h = old.h;
    this.w = old.w;

}

public void Information() {
    System.out.println("Running the box");
}

}
