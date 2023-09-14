/*
   TRIANGULAR PATTERN:
   FOR EXAMPLE:-
                 A A A A A
                 B B B B
                 C C C
                 D D
                 E
 */
import java.util.Scanner;
public class pattern26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++)
            {
                System.out.printf("%c ",('A'+i-1));
            }
            System.out.println();
        }
    }
}

