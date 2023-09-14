/*Adding two array*/
import java.util.Scanner;
public class Array2D1 {
    static void printMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] getInputArray(int r,int c){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;
    }
    static int[][] matrixAddtion(int[][] matrixA,int row1,int col1,int[][] matrixB){
        int[][] matrix=new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matrix[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        return matrix;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix A");
        int row1=sc.nextInt();
        System.out.println("Enter the number of columns in matrix A");
        int col1=sc.nextInt();
        System.out.println("Enter the number of rows in matrix B");
        int row2=sc.nextInt();
        System.out.println("Enter the number of columns in matrix B");
        int col2=sc.nextInt();
        if(row1!=row2||col1!=col2){
            System.out.println("Addition not possible");
            System.exit(0);
        }
        System.out.println("Enter the "+row1*col1+" elements of matrix A");
        int[][] matrixA=getInputArray(row1,col1);
        System.out.println("Enter the "+row2*col2+" elements of matrix B");
        int[][] matrixB=getInputArray(row2,col2);
        int [][] matrix=matrixAddtion(matrixA,row1,col1,matrixB);

        System.out.println("Matrix A");
        printMatrix(matrixA);
        System.out.println("Matrix B");
        printMatrix(matrixB);
        System.out.println("Addition Matrix of matrixA and matrixB is ");
        printMatrix(matrix);
    }
}
