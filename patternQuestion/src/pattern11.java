/*NUMERICAL TRIANGULAR PATTERN
 For Example:- if r=4
                                   1
                                  2 2
                                 3   3
                                4444444
 */
import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("**********REQUIRED NUMERICAL TRIANGULAR PATTERN***********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if(j==1||j==(2*i-1)||i==r) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
