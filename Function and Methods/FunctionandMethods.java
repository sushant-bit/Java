/*returnType functionName(parameterType parameterName, ...) {
   operations//function body
   }*/
// import java.util.*;
// public class FunctionandMethods{
//    public static void printYourName(String name){
//       System.out.println("Your name is " + name);
//       return;
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String name =sc.next();

//       printYourName(name);//calling function
//    }
// } 
// import java.util.*;
// public class FunctionandMethods{
//   public static int calculateSum(int a, int b){
//       int sum = a + b;
//       return sum;
//    }
//    public static void main(String[] args) {
//       System.out.println("Enter two numbers to find their sum");
//       Scanner sc = new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       int sum =calculateSum(a, b);

//      System.out.println("The sum of two numbers is " + sum);

      
//    }
// } 

// import java.util.*;
// public class FunctionandMethods{
//   public static int multiplyNumbers(int a, int b){
//       int product = a * b;
//       return product;
//    }
//    public static void main(String[] args) {
//       System.out.println("Enter two numbers to find their sum");
//       Scanner sc = new Scanner(System.in);
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       int product =multiplyNumbers(a, b);

//      System.out.println("The sum of two numbers is " + product);

      
//    }
// } 


import java.util.*;

public class FunctionandMethods {
    public static void printFactorial(int a) {
      if(a<0){
         System.out.println("Factorial is not defined for negative numbers");
         return;
      }
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + a + " is: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int a = sc.nextInt();
        printFactorial(a);
    }
}
