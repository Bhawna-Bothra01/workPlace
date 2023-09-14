//given two numbers x and y. Find the greatest common divisor of x and y using recursion(division method).
import java.util.Scanner;
public class Recursion12 {
    static int gcd(int m,int n){
        if(n==0) return m;
        return gcd(n,m%n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("GCD = "+gcd(m,n));
    }
}
