package basicProgramming;

import java.io.*;
import java.util.*;

public class postFixConversionAndEvaluation{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> vs = new Stack<>();
    Stack<String> is = new Stack<>();
    Stack<String> ps = new Stack<>();

 for(int i = 0 ; i  < exp.length() ; i++){
     char ch = exp.charAt(i);

     if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
      int v2 = vs.pop();
      int v1 = vs.pop();
      int vvalue = operation(v1, v2, ch);
      vs.push(vvalue);

      String is2 = is.pop();
      String is1 = is.pop();
      String isvalue = "(" + is1 + ch + is2 +  ")" ;
      is.push(isvalue);

      String ps2 = ps.pop();
      String ps1 = ps.pop();
      String psvalue = ch + ps1 + ps2 ;
      ps.push(psvalue);

     } else {
         vs.push(ch - '0');
         is.push(ch + "");
         ps.push(ch + "");
     }

 }
System.out.println(vs.pop());
System.out.println(is.pop());
System.out.println(ps.pop());
    }


public static int operation(int v1 , int v2  , char op ){
    if( op == '+'){
    return v1 + v2 ;
    } else if(op == '-'){
      return v1 - v2;
    } else if(op == '*'){
      return v1 * v2;
    } else{
        return v1  /  v2;
    }
}
}
