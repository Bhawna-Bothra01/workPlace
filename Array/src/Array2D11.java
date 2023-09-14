/*Sum of rectangle using prefix sum over both rows and cols*/
/*Given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from
(l1,r1) to (l2,r2)*/
import java.util.Scanner;
public class Array2D11 {
    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void findRowPrefixSumMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        printMatrix(matrix);
    }
    static void findColPrefixSumMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                matrix[j][i] += matrix[j - 1][i];
            }
        }
        printMatrix(matrix);
    }
        static int findSum(int[][] matrix,int r1,int c1,int r2,int c2){
            int sum = 0;
            findRowPrefixSumMatrix(matrix);
            findColPrefixSumMatrix(matrix);

            if(r1>=1&&c1>=1)
                sum=matrix[r2][c2]-matrix[r2][c1-1]-matrix[r1-1][c2]+matrix[r1-1][c1-1];

            else if(r1>=1)
                sum=matrix[r2][c2]-matrix[r1-1][c2];
            else if(c1>=1)
                sum=matrix[r2][c2]-matrix[r2][c1-1];
            else sum=matrix[r2][c2];
            return sum;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row of matrix");
        int r=sc.nextInt();
        System.out.println("Enter the number of column of matrix");
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        System.out.println("Enter "+r*c+" elements of the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rectangular boundaries: r1,c1,r2,c2 respectively");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println("The sum of rectangular block in matrix is "+findSum(matrix,r1,c1,r2,c2));
    }
}
