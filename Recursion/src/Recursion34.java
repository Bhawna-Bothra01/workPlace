//Given a string, write a method to print all its subsequences.
import java.util.Scanner;
public class Recursion34 {
    static void printSSQ(String str,String currAns){
        if(str.length()==0){
            System.out.println(currAns);
            return;
        }
        char currChar=str.charAt(0);
        String remString= str.substring(1);
        printSSQ(remString,currAns+currChar);
        printSSQ(remString,currAns);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Subsequences of String "+str+" are:-");
        printSSQ(str,"");
    }
}
