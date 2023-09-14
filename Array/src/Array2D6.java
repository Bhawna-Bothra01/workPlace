/*Given an integer n, return the first n rows of pascal's triangle. In Pascal's triangle, each number is the sum of the
two numbers directly above it as shown:*/
import java.util.Scanner;
public class Array2D6 {
    static void printArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in pascal triangle");
        int r=sc.nextInt();
        int[][] pTriangle=new int[r][];
        for(int i=0;i<r;i++){
            pTriangle[i]=new int[i+1];
            for(int j=0;j<pTriangle[i].length;j++)
            {
                if(j==0||j==pTriangle[i].length-1){
                    pTriangle[i][j]=1;
                }
                else
                    pTriangle[i][j]=pTriangle[i-1][j]+pTriangle[i-1][j-1];
            }
        }
        System.out.println("Pascal Triangle");
        printArray(pTriangle);
    }
}
