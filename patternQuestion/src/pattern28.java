/*
   TRIANGULAR PATTERN:
   FOR EXAMPLE:-
                 E E E E E
                 D D D D
                 C C C
                 B B
                 A
 */
import java.util.Scanner;
public class pattern28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++)
            {
                System.out.printf("%c ",('A'+r-i));
            }
            System.out.println();
        }
    }
}



