import java.util.*;
public class InvertedHalfPyramidWithNumber {
    public static void main(String[] args) {
        //inverted half pyramid with numbers
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
        //inner lopp
for(int j=1;j<=n-i+1;j++){
    System.out.print(j);
}

System.out.println();
        }
    }
    
}
