/*
   TRIANGULAR PATTERN:
   FOR EXAMPLE:-
                         *
                       * *
                     * * *
                   * * * *
                 * * * * *
 */
import java.util.Scanner;
public class pattern30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++)
            {
                if(j<=(r-i)) System.out.print("  ");// 2 tab space if you are giving * and i tab in next line
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}



