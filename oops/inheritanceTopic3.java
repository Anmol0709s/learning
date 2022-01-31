package oops;

public class inheritanceTopic3 extends inheritanceTopic{
    double weight;

    public inheritanceTopic3(){
        this.weight = -1;
    }
inheritanceTopic3(inheritanceTopic3 other){
   super(other);
    weight = other.weight;

}
inheritanceTopic3(double side , double weight){
    super(side);
    this.weight = weight;
}

    public  inheritanceTopic3(double l , double h  , double w , double weight) {
        super(l , h ,w);// what is this? calling the parent class construtor
        //use to initialise values preent in parent class 
        // but not use in private class
      
   //   System.out.println(super.w); // we use super instead this here because super directly point to parent class but
                                 // this point to child class so for spedd and tejji we use super here
        this.weight = weight;
    }

}
                   