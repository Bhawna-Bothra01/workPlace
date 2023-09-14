//Write a program to check given string  is palindrome or not using recursion.
import java.util.Scanner;
public class Recursion30 {
    static String reverseString1(String str,int idx){
        if(idx==str.length()) return "";
        String smallAns = reverseString1(str,idx+1);
        return smallAns + str.charAt(idx);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("ORIGINAL STRING: " + str);
        String reverse = reverseString1(str,0);
        if(reverse.equals(str)) System.out.print(str+" is palindrome");
        else System.out.print(str+" is not palindrome");
    }
}
/*
 TC = O(n^2)
 */
