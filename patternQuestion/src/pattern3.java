/*Triangular pattern:
* FOR EXAMPLE:
               *
               **
               ***
               ****
               *****      */
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Required triangular pattern");
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
