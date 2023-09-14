// Character Rectangular pattern :-
/* FOR EXAMPLE
                A A A A A
                B B B B B
                C C C C C
                D D D D D
                E E E E E
 */
import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of column");
        int c=sc.nextInt();
        System.out.println("**********REQUIRED CHARACTER PATTERN***********");
        for(int i=1;i<=r;i++){
            char ch= (char) ('A'+(i-1));
            for(int j=1;j<=c;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

