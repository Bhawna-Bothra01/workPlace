//Write a program to print reverse of a string using recursion.
import java.util.Scanner;
public class Recursion29 {
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
        System.out.println("REVERSED STRING: "+reverse);
    }
}
/*
 TC = O(n^2)
 */