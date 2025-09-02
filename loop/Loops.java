import java.util.*;

public class Loops{
    public static void main(String[]args){
        // for(int counter=0; counter<=10;counter++){
        //     System.out.print(counter+" ");
        // }

        // for(int i=1;i<5;i++){
        //     System.out.println(i);
        // }
//         int i=0;
//         while(i<11){
// System.out.println("sushant");
// i++;
//         }

// int i=0;
// do{
//     System.out.println(i);
//     i++;
// }while(i<11);
//    


// int i=12;
// while(i<12){
//     System.out.println(i);
//     i++;
// }


// do{
//     System.out.println("Sushant");
//     i++;
// }while(i<11);



Scanner sc = new Scanner(System.in);
int choice;
int marks;
// int n = sc.nextInt();
// int n2 = sc.nextInt();
// int sum =0;
// for(int i=1;i<=n;i++){
//     sum+=i;
// }
// System.out.println(sum);

// for(int i=1;i<=10;i++){
//     System.out.println(n+"x"+ i+"=" + n*i);
// }
// int i=1;

// while(i<=10){
//     System.out.println(n+"x"+ i+"="+ n*i);
//     i++;
// }

// do{
//     System.out.println(n+"x"+ i+"="+ n*i);
//     i++;
// }while(i<=10);

 
// for(int i=1;i<=n;i++){

//     if(i%2==0)
//     System.out.println(i);
//     }

do{
    System.out.println("Enter 1 to print marks, 0 to stop.");
    choice = sc.nextInt();
    if(choice==1){
        System.out.println("Enter student marks");
        marks = sc.nextInt();
        if(marks>=90){
            System.out.println("This is good");
        }
        else if(marks>=80 || marks>=60){
            System.out.println("This is also good");
        }while()
    }
}


    }
}