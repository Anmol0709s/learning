package oops;
// this is a demo to  show initialisation of static variation
public class staticBlock {
    static int a = 4;
    static int b ;
    //will only run once when the first obj is create i.e. when the class is  loaded for the first time
    static{
System.out.println(" i m in staticblock ");
b =  a * 5;
    }
    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a + " " + staticBlock.b);
       
       
        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }

}
