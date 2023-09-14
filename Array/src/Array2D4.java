/*Find transpose of matrix without using extra space*///this is only applicable for square matrix
import java.util.Scanner;
public class Array2D4 {
    static int[][] getInputMatrix(int r,int c){
        Scanner sc=new Scanner(System.in);
        int[][] matrix= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void matrixTranspose(int [][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of column of matrix");
        int c=sc.nextInt();
        System.out.println("Enter the element of the matrix");
        int[][] matrix=getInputMatrix(r,c);
        System.out.println("Original matrix");
        printMatrix(matrix);
        matrixTranspose(matrix,r,c);
        System.out.println("Transpose matrix");
        printMatrix(matrix);
    }
}
