/*
    TRIANGULAR PATTERN
    FOR EXAMPLE:-
                  * * * * *
                    * * * *
                      * * *
                        * *
                          *
 */
import java.util.Scanner;
public class pattern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("*********REQUIRED TRIANGULAR PATTERN ********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=r-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
