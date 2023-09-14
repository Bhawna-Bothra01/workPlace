//Remove all the occurrence of 'a' from string s="abcax". here method will contain only one parameter and we are using substring method
import java.util.Scanner;
public class Recursion27 {
    static String removeAllOccurrence1(String str){
        if(str.length()==0) return "";
        String ans="";
        if(str.charAt(0)!='a') ans+=str.charAt(0);
        return ans+removeAllOccurrence1(str.substring(1));
    }
    /*
         another way is:-
         static String removeA2(String s){
           if(s.length()==0) return "";
           String smallAns = removeA2(s.substring(1));
           char currChar = s.charAt();
           if(currChar!= 'a') return currChar + smallAns;
           else return smallAns;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("ORIGINAL STRING: " + str);
        String ans = removeAllOccurrence1(str);// it will remove all occurrences of 'a' in the string str starting from index idx
        System.out.print("After removing all the 'a' from string is: " + ans);
    }
}
/*
   TC of str.substring(1)= O(n);
*/
