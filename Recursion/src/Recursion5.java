//Given an integer, find out the sum of its digits using recursion
import java.util.Scanner;
public class Recursion5 {
    static int sumOfDigits(int n){
        if(n==0) return 0;
        return (sumOfDigits(n/10)+(n%10));
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Sum of digits of "+num+" is "+sumOfDigits(num));
    }
}
