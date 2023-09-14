//Find factorial of n using recursion
import java.util.Scanner;
public class Recursion3 {
    static int factorial(int n){
        int fact;
        if(n==0){
            return 1;
        }
        fact=n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n'");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}
