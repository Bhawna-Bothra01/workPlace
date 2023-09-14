/*Rectangular Pattern
* FOR EXAMPLE:  *******
*               *******
*               *******
*               *******   */
import java.util.Scanner;
public class pattern1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of column");
        int col=sc.nextInt();
        System.out.println("Required rectangular pattern");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");   // printing rows
            }
            System.out.println();
        }

    }
}
