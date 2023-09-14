//Write a program to check given number is palindrome or not using recursion.
//  Here we are using two pointers.
import java.util.Scanner;
public class Recursion32{
    static int integerReverse(int num,int len){
        if(num==0) return 0;
        return (int)(num%10*Math.pow(10,len-1)+integerReverse(num/10,len-1));
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int len= Integer.toString(num).length();
        System.out.println(integerReverse(num,len));
        if(integerReverse(num,len)==num) System.out.println(num+" is palindrome");
        else System.out.println(num+" is not palindrome");
    }
}
/*
METHOD 2:
  static int pal(int n, int sum)
  if(n==0) return sum;
  sum=(sum*10)+n%10;
  return pal(n/10,sum);
 */