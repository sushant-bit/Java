import java.util.*;
public class ButterflyPattern{
    public static void main(String[] args){
        System.out.println("Enter the number to print the pattern:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop

        //first half--> upper half
        for(int i=1;i<=n;i++){

            // first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // second part

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

            


        }

        //second half--> lower half
        for(int i=n;i>=1;i--){

            // first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            // second part

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

            


        }

    }
}