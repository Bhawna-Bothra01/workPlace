import java.util.Scanner;
public class Recursion2 {
    static void printDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n'");
        int n=sc.nextInt();
        System.out.println("All natural numbers from "+n+" to 1 are");
        printDecreasing(n);
    }
}
