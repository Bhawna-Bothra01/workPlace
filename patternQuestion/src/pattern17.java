/*
    Character Pattern:
    FOR EXAMPLE:-
                  E E E E E
                  D D D D D
                  C C C C C
                  B B B B B
                  A A A A A
 */
import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("********REQUIRE CHARACTER PATTERN********");
        for(int i=1;i<=r;i++){
            char ch=(char)('A'+r-i);
            for(int j=1;j<=c;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
