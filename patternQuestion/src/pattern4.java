/* Triangular pattern
   FOR EXAMPLE:
   *****
   ****
   ***
   **
   *
 */
import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Required triangular pattern");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i+1;j++)//for(int j=r;j>=i;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
