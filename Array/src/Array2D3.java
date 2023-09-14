/*Find transpose of a given matrix*/
import java.util.Scanner;
public class Array2D3 {
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
    static int [][] matrixTranspose(int[][] matrix,int r,int c){
        int[][] tMatrix=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                tMatrix[i][j]=matrix[j][i];
            }
        }
        return tMatrix;
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
        int [][] tMatrix=matrixTranspose(matrix,r,c);
        System.out.println("Transpose matrix");
        printMatrix(tMatrix);
    }
}
