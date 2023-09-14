//Write a code to count the digit of the number using recursion
import java.util.Scanner;
public class Recursion6 {
    static int digitCount(int num){
        if(num==0) return 0;
        int x=digitCount(num/10);
        x++;
        return x;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Number of digits in "+num+" is 1");
            return;
        }
        System.out.println("Number of digits in "+num+" is "+digitCount(num));
    }
}
