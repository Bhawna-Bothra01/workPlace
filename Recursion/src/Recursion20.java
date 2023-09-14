//Write a program to find whether the given number is armstrong number or not using recursion;
import java.util.Scanner;
public class Recursion20 {
    static int armstrongNumber(int num,int nd){
        if(num==0) return 0;
        int sum= (int) (armstrongNumber(num/10,nd)+Math.pow(num%10,nd));
        return sum;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int numDigit= Integer.toString(num).length();//first converted num to String and then find the length of string
        // which is equal to number of digit of num
        if(num==armstrongNumber(num,numDigit)) System.out.println(num+" is armstrong Number");
        else System.out.println(num+" is not armstrong Number");
    }
}
