//Find Fibonacci series up to n term
import java.util.Scanner;
public class Recursion4 {
    static int fibonacciSeries(int n){
        if(n==0||n==1) return n;
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms up to which you want fibonacci series");
        int n=sc.nextInt();
        System.out.println("Fibonacci series up to "+n+" terms is ");
        for(int i=0;i<n;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }
    }
}
