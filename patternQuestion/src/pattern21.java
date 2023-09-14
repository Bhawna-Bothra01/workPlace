/*
   TRIANGULAR PATTERN:
   FOR EXAMPLE:-
                 A
                 A B
                 A B C
                 A B C D
                 A B C D E
*/
import java.util.Scanner;
public class pattern21 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%c ",('A'+j-1));
            }
            System.out.println();
        }
    }
}
