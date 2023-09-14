/*
   TRIANGULAR PATTERN:
   FOR EXAMPLE:-
                5 4 3 2 1
                5 4 3 2
                5 4 3
                5 4
                5
 */
import java.util.Scanner;
public class pattern23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++)
            {
                System.out.print((r-j+1)+" ");
            }
            System.out.println();
        }
    }
}
