import java.util.*;
public class ZeroOneTriangle {
    public static void main(String[] args) {
        //Zero One Triangle
        System.out.println("Enter the number of rows for the Zero One Triangle:");
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0) //even
                {
                    System.out.print("1 ");
                }
                else{ //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
