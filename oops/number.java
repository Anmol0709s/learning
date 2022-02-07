package oops;

import java.lang.reflect.Constructor;

public class number {
    double sum(double a , int b) {
		return a + b;

	}
		int sum(int a , int b , int c ) {
		 return a + b + c;

}

		
		public static void main(String[] args) {
		number obj = new number();
	
		obj.sum( 1 ,2);
		obj.sum(5,6 ,4);
		

        }
}
