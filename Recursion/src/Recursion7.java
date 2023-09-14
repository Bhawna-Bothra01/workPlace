//Given two numbers p&q, find the value p^q using a recursive function.
import java.util.Scanner;
public class Recursion7 {
    static long powerCalculate(int p,int q){
        if(q==0) return 1;
        return powerCalculate(p,q-1)*p;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int p=sc.nextInt();
        System.out.println("Enter the power of the "+p);
        int q=sc.nextInt();
        System.out.println(p+"^"+q+"= "+powerCalculate(p,q));
    }
}
