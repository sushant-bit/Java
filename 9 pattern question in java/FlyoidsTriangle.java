import java.util.*;
public class FlyoidsTriangle {
    public static void main(String[] args) {
        // floyd's triangle
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number++; //numner = number + 1
            }
            System.out.println();
        }
    }
}
