/*Sum of rectangle using Brute force method.*/
/*Given a matrix 'a' of dimension n*m and 2 coordinates (l1,r1) and (l2,r2). Return the sum of the rectangle from
(l1,r1) to (l2,r2)*/
import java.util.Scanner;
public class Array2D9 {
    static int findSum(int[][] matrix,int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=matrix[i][j];
            }
        }
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
