// Rectangular pattern :-
/* FOR EXAMPLE
                5 5 5 5 5
                4 4 4 4 4
                3 3 3 3 3
                2 2 2 2 2
                1 1 1 1 1
 */
import java.util.Scanner;
public class pattern13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of column");
        int c=sc.nextInt();
        System.out.println("**********REQUIRED NUMERICAL RECTANGULAR PATTERN***********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print((r-i+1)+" ");
            }
            System.out.println();
        }
    }
}
