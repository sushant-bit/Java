import java.util.*;
public class Exercise {
//    public static int CalculateAverage(int a, int b, int c){
//     int average = (a+b+c)/3;
//     return average;
//    }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         System.out.println("Average of three number is :"+ CalculateAverage(a, b, c));
//     }

// public static void PrintOddSum(int n){
//     int sum=0;
//     for(int i=1;i<=n;i++){
//         if(i%2!=0){
//             sum=sum+i;
//         }

//     }
//     System.out.println("Sum of odd numbers is :"+sum);

// }

// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int n = sc.nextInt();
//     PrintOddSum(n);
// }


// public static int GreaterNumber(int a,int b){
//     if(a>b){
//         return a;
//     }
//     else{
//         return b;
//     }
// }

// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println("Greater number is :"+ GreaterNumber(a, b));
// }


// public static void CircumferenceOfCircle(int r){
//     double circumference = 2* Math.PI*r;
//     System.out.println("Circumference of circle is :"+circumference);
// }

// public static void main(String[] args) {
//     Scanner sc =new Scanner(System.in);
//     int r = sc.nextInt();
//     CircumferenceOfCircle(r);
// }


public static void CanVoteOrNot(int age){
    if(age>=18){
        System.out.println("You are eligible to vote");
    }
    else if(age<0){
        System.out.println("Age cannot be negative");
    }
    else{
        System.out.println("You are not eligible to vote");
    }
}


public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int age = sc.nextInt();
    CanVoteOrNot(age);
}
}
