import java.util.*;
public class HalfpyramidPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // taking rows as input
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*"); // printing star
            }

            System.out.println(" "); // new line after each row
        }
    }
}
