/*Given an n*m matrix 'a',return all elements of the matrix in spiral order.*/
import java.util.Scanner;
public class Array2D7 {
    static void printArray(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c){
            //top Row
            for(int i=leftCol;i<=rightCol&&totalElements<r*c;i++){
                System.out.print(matrix[topRow][i]+" ");
                totalElements++;
            }
            topRow++;
            //right Column
            for(int i=topRow;i<=bottomRow&&totalElements<r*c;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //bottom Row
            for(int i=rightCol;i>=leftCol&&totalElements<r*c;i--){
                System.out.print(matrix[bottomRow][i]+" ");
                totalElements++;
            }
            bottomRow--;
            //left column
            for(int i=bottomRow;i>=topRow&&totalElements<r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements of the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printArray(matrix);
        System.out.println("Spiral order of the matrix");
        printSpiralOrder(matrix,r,c);
    }
}
