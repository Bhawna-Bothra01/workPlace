/*
     Character Pattern:
     FOR EXAMPLE:-
                   E D C B A
                   E D C B A
                   E D C B A
                   E D C B A
                   E D C B A
 */
import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("********REQUIRE CHARACTER PATTERN********");
        for(int i=1;i<=r;i++) {
            for (int j = 1; j <= c; j++) {
                char ch = (char) ('A' + c - j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
