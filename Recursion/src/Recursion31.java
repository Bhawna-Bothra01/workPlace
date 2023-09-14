//Write a program to check given string  is palindrome or not using recursion. Here we are using two pointers.
import java.util.Scanner;
public class Recursion31 {
    static boolean isPalindrome(String str,int l,int r){
        if(l>=r) return true;
        return (str.charAt(l)==str.charAt(r) && isPalindrome(str,l+1,r-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("ORIGINAL STRING: " + str);
        if(isPalindrome(str,0,str.length()-1)) System.out.print(str+" is palindrome");
        else System.out.print(str+" is not palindrome");
    }

}
/*
   TC = O(n)
 */
