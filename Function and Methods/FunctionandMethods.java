/*returnType functionName(parameterType parameterName, ...) {
   operations//function body
   }*/
import java.util.*;
public class FunctionandMethods{
   public static void printYourName(String name){
      System.out.println("Your name is " + name);
      return;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name =sc.next();

      printYourName(name);//calling function
   }
} 