/*
   PYRAMID PATTERN
   FOR EXAMPLE:-
                               A
                              A B
                             A B C
                            A B C D
                           A B C D E
*/
import java.util.Scanner;
public class pattern39 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                char ch=(char)('A'+k-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

