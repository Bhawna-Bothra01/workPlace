/*Given a positive integer n,generate an n*n matrix filled with elements from 1 to n*2 in spiral order.*/
import java.util.Scanner;
public class Array2D8 {
    static void printArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] generateSpiralMatrix(int n){
        int cur=1,topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int[][] matrix=new int[n][n];
        while(cur<=n*n){
            for(int j=leftCol;j<=rightCol&&cur<=n*n;j++){
                matrix[topRow][j]=cur;
                cur++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow&&cur<=n*n;i++){
                matrix[i][rightCol]=cur;
                cur++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol&&cur<=n*n;j--){
                matrix[bottomRow][j]=cur;
                cur++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow&&cur<=n*n;i--){
                matrix[i][leftCol]=cur;
                cur++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int[][] matrix=generateSpiralMatrix(n);
        System.out.println("Spiral Matrix");
        printArray(matrix);
    }
}
