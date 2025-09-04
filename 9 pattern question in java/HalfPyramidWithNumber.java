import java.util.*;

public class HalfPyramidWithNumber {
    public static void main(String[] args) {
        
        //half pyramid with numbers
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //number of rows
        //outer lopp
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
