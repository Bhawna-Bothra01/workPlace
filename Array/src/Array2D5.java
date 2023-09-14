/*Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space*/
import java.util.Scanner;
public class Array2D5 {
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
    static void transposeMatrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void rotateMatrix(int [][] matrix){
        transposeMatrix(matrix);
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int k=n-j-1;
                if(j<k) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][k];
                    matrix[i][k] = temp;
                }
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
        rotateMatrix(matrix);
        System.out.println("Matrix  we get after rotating  by 90 degree");
        printMatrix(matrix);
    }
}
