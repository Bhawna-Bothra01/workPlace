/*
    Character pattern:-
    FOR EXAMPLE:-
                  A B C D E
                  A B C D E
                  A B C D E
                  A B C D E
                  A B C D E
 */
import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("********REQUIRED CHARACTER PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                char ch=(char)('A'+j-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
