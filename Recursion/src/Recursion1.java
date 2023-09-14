import java.util.Scanner;
public class Recursion1 {
    static void printIncreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of 'n'");
        int n=sc.nextInt();
        System.out.print("First "+n+" natural numbers are: ");
        printIncreasing(n);
    }
}
