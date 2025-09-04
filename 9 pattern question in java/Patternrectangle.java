import java.util.*;
public class Patternrectangle {
    
public static void main(String args[]){
    // Solid Rectangle
    System.out.println("Enter number of rows and columns for Solid Rectangle:");
    Scanner sc = new Scanner(System.in);
    int row =sc.nextInt();
    int colums = sc.nextInt();
//outer loop
    for(int i=1;i<=row;i++){
// inner loop

for(int j=1;j<=colums;j++){
    System.out.print("*");
}

System.out.println();
    }


}


}
