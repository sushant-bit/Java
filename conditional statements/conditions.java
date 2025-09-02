// import java.util.*;

// public class conditions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);   
//         int age = sc.nextInt();
//         if(age>18){
//             System.out.println("Adult");
//         }
//         else{

//             System.out.println("Not Adult");
//         }
//     }
// }



// import java.util.*;
// public class condtions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num%2==0){
//             System.out.println("It is Even Number");
//         }

//         else{
//             System.out.println("It is odd number");
//         }
//     }
// }

// import java.util.Scanner;

// public class conditions{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Scanner sc1 = new Scanner(System.in);
//         int a=sc.nextInt();
//         int b = sc1.nextInt();


//         if (a==b){
//             System.out.println("Both are equal");
//         }
//         else if (a>b){
//             System.out.println("a is greater");
            
//         }
//         else{
//             System.out.println("a is lesser");
//         }
//     }
// }   


import java.util.*;
public class conditions{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        switch (num){
        case 1: System.out.println("Hello");
        break;
        case 2: System.out.println("Namaste");
        break;
        case 3: System.out.println("Bonjour")
        ;break;
        default: System.out.println("Invalid Input");    
        }
    }
}