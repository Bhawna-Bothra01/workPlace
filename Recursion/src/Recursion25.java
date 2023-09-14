//given two numbers x and y. Find the greatest common divisor of x and y using recursion(Brute Force Approach).
import java.util.Scanner;
public class Recursion25 {
    static int gcdByBFA(int m,int n,int min){
        if(min==1) return min;
        if(m%min==0&&n%min==0) return min;
        return gcdByBFA(m,n,min-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m==0) {
            System.out.println("GCD = "+n);
            return;
        }
        if(n==0) {
            System.out.println("GCD ="+m);
            return;
        }
        int min=(m>n)?n:m;
        System.out.print("GCD = "+gcdByBFA(m,n,min));
    }
}
