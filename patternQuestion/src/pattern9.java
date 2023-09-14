/* NUMERICAL TRIANGULAR PATTERN
 For Example:- if r=4
                      1
                      12
                      123
                      1234
 */
import java.util.Scanner;
public class pattern9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("**********REQUIRED NUMERICAL TRIANGULAR PATTERN***********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
