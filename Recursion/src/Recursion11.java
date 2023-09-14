//Given a number n.Find the sum of natural numbers till n but with alternate signs.
import java.util.Scanner;
public class Recursion11 {
    static int sumOfSeries(int n){
        if(n==0) return 0;
        if(n%2==0) return sumOfSeries(n-1)-n;
        return sumOfSeries(n-1)+n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n'");
        int n=sc.nextInt();
        System.out.print("The sum of natural numbers till "+n+" but with alternate signs is "+sumOfSeries(n));
    }
}
