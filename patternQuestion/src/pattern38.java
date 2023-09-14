/*
   PYRAMID PATTERN
   FOR EXAMPLE:-
                               A
                              B B
                             C C C
                            D D D D
                           E E E E E
*/
import java.util.Scanner;
public class pattern38 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED PATTERN********");
        for(int i=1;i<=r;i++){
            char ch=(char)('A'+i-1);
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");// one tab space
            }
            for(int k=1;k<=i;k++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

