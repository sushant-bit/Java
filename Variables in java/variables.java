// public class variables{
//     public static void main (String args[]){
//variables
// String name = "Tony Stark";
// int a = 30;
// int b =12;
// int age = 23;
// double price = 19.99;

// System.out.println("My name is " + name + " and "+ " I am " + age + " years old.");

// int a =10;
// int b=90;
// int sum = a+b;
// System.out.println(sum);


//     }}


// import java.util.*;
// public class  variables{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }



// import java.util.*;
// public class  variables{
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
       
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        
//     }
// }

import java.util.*;
public class variables{
    public static void main (String[] args){
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = pi * radius *radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
