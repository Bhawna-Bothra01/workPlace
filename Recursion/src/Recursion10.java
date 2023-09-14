//Sum of 'n' natural number
import java.util.Scanner;
public class Recursion10 {
    static int sumOfNNN(int n){
        if(n==0) return 0;
        return sumOfNNN(n-1)+n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vale of 'n'");
        int n=sc.nextInt();
        System.out.print("Sum of first "+n+" natural numbers is "+sumOfNNN(n));
    }
}
