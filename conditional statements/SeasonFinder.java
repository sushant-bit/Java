import java.util.*;

// public class gptsolve{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         Scanner sc1 = new Scanner (System.in);
//         Scanner operator = new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc1.nextInt();
//         String operatorr=operator.next();

//         switch(operatorr){
//             case"+":System.out.println(num1+num2);
//             break;
//             case"-":System.out.println(num1-num2);
//             break;
//             case"*":System.out.println(num1*num2);
//         break;
//     case"/":System.out.println(num1/num2);
// break;
// default:System.out.println("Invalid operator");        }
//     }
// }


// public class gptsolve{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
        
//         int num=sc.nextInt();

//         switch(num){
//         case 1: System.out.println("Sunday");
//         break;   
//          case 2: System.out.println("Monday");
//         break; 
//          case 3: System.out.println("Tuesday");
//         break; 
//          case 4: System.out.println("Wednesday");
//         break; 
//          case 5: System.out.println("Thursday");
//         break; 
//          case 6: System.out.println("Friday");
//         break; 
//          case 7: System.out.println("Saturday");
//         break; 
//         default: System.out.println("Invalid INput");
       
        
//         }
//     }
// }


// public class gptsolve{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
        
//         String n=sc.next();

//         switch(n){
//         case "A": System.out.println("Excellent");
//         break;   
//          case "B": System.out.println("Good");
//         break;   
//          case "C": System.out.println("Average");
//         break;   
//          case "D": System.out.println("Poor");
//         break;   
//          case "F": System.out.println("Fail");
//         break;   
//         default: System.out.println("Invalid INput");
       
        
//         }
//     }
// }



import java.util.*;

public class SeasonFinder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 12: 
            case 1: 
            case 2: 
                System.out.println("Winter");
                break;
            case 3: 
            case 4: 
            case 5: 
                System.out.println("Spring");
                break;
            case 6: 
            case 7: 
            case 8: 
                System.out.println("Summer");
                break;
            case 9: 
            case 10: 
            case 11: 
                System.out.println("Autumn");
                break;
            default: 
                System.out.println("Invalid month number!");
        }
    }
}
