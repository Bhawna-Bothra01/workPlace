/*
    TRiANGULAR PATTERN:
    FOR EXAMPLE:-
                  1 1 1 1 1
                  2 2 2 2
                  3 3 3
                  4 4
                  5
 */
import java.util.Scanner;
public class pattern22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("********REQUIRED TRIANGULAR PATTERN********");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=(r-i+1);j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
