public class InvertedHalfPyramidRotate180 {
    public static void main(String[] args) {
        //inverted half pyramid rotated 180 degrees
        int n = 5; //number of rows
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop --> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //inner loop --> star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
}
