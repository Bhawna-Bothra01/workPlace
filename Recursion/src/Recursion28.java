//Write a program to print reverse of a string using recursion. Here method will contain only one parameter and we are using substring method
import java.util.Scanner;
public class Recursion28 {
    static String reverseString(String str){
        if(str.length()==0) return "";
        String smallAns = reverseString(str.substring(1));
        char currChar = str.charAt(0);
        return smallAns + currChar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("ORIGINAL STRING: " + str);
        String reverse = reverseString(str);
        System.out.println("REVERSED STRING: "+reverse);
    }
}
