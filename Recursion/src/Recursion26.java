//Remove all the occurrence of 'a' from string s="abcax".
import java.util.Scanner;
public class Recursion26 {
    static String removeAllOccurrence(String str,int idx){
        if(idx==str.length()) return "";
        String ans="";
        if(str.charAt(idx)!='a') ans+=str.charAt(idx);
        return ans+removeAllOccurrence(str,idx+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("ORIGINAL STRING: "+str);
        String ans=removeAllOccurrence(str,0);// it will remove all occurrences of 'a' in the string str starting from index idx
        System.out.print("After removing all the 'a' from string is: "+ans);
    }
}
/*TIME COMPLEXITY:-
    TC= number of calls * Time taken in 1 call
      =         n       *          n(where n is length of String)
    concatenation of string is the order of O(n) where n is length of string
    TC= O(n^2)
    Why String concatenation is of order of O(n)?
    str1 = "Hello" // n no. of characters
    str2 = "World" // m no. of characters
    str = str1+str2 // n+m characters jur rhe hai to
    TC = O(n)
 */
