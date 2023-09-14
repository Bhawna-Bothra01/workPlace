/*
   TRIANGULAR PATTERN:
   FOR EXAMPLE:-
                 1 2 3 4 5
                 1 2 3 4
                 1 2 3
                 1 2
                 1
 */
import java.util.Scanner;
public class pattern25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

