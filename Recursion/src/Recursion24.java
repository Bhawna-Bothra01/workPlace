//given two numbers x and y. Find the greatest common divisor of x and y using recursion(difference method).
import java.util.Scanner;
public class Recursion24 {
    static int gcdByDifference(int m,int n){
        if(m==n) return m;
        if(m>n) return gcdByDifference(m-n,n);
        return gcdByDifference(n,n-m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.print("GCD = "+gcdByDifference(m,n));
    }
}
