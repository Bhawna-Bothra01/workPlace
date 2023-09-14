//Write a program to multiply two numbers.
import java.util.Scanner;
public class Recursion21{
    static int multiplyTwoNum(int m,int n){
        if(n==0) return 0;
        return m+multiplyTwoNum(m,n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number in descending order");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Multiply "+num1+"*"+num2+" = "+multiplyTwoNum(num1,num2));
    }
}
