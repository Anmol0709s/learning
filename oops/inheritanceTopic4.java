package oops;

public class inheritanceTopic4 extends inheritanceTopic3{
    

   
     double price;
    

     public inheritanceTopic4(){
         super();
         this.price = -1;
     }

    public inheritanceTopic4(inheritanceTopic4 other){  
    super(other);
        this.price =  other.price;
    }

    public inheritanceTopic4(double l , double h  , double w , double weight , double price){
        super(l , h , w , weight );
        this.price = price;
    }
    public inheritanceTopic4(double side , double weight , double price){
        super(side , weight);
       this.price = price;

    }
}
