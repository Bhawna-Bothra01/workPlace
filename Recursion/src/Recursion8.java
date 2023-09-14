//Given two numbers p&q, find the value p^q using a recursive function. Method 2
import java.util.Scanner;
public class Recursion8 {
    static long powerCalculate2(int p,int q){
        if(q==0) return 1;
        long smallPow=powerCalculate2(p,q/2);
        if(q%2==0) return smallPow * smallPow;
        return p * smallPow * smallPow;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int p=sc.nextInt();
        System.out.println("Enter the power of the "+p);
        int q=sc.nextInt();
        System.out.println(p+"^"+q+"= "+powerCalculate2(p,q));
    }
}
