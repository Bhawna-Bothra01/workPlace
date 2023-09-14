// Rectangular pattern :-
/* FOR EXAMPLE
                1 1 1 1 1   r=1
                2 2 2 2 2   r=2
                3 3 3 3 3
                4 4 4 4 4
                5 5 5 5 5
 */
import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("**********REQUIRED NUMERICAL RECTANGULAR PATTERN***********");
        for(int i=1;i<=r;i++){ //r
            for(int j=1;j<=c;j++){  //c
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
