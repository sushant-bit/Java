
import java.util.*;
public class HollowrectanglePattern {
    public static void main(String[] args) {
        // Hollow Rectangle
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colums=sc.nextInt();
        //Outer loop
        for(int i=1;i<=row;i++){
            //inner loop
            for(int j=1;j<=colums;j++){
                // cell (i,j)
                if(i==1|| j==1||i==row||j==colums){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
