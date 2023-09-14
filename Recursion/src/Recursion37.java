//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could
// represent. Return the answer in any order.
import java.util.Scanner;
public class Recursion37 {
    static void combinations(String str,String[] kp,String res){
        if(str.length()==0) {
            System.out.println(res);
            return;
        }
        int currNum= str.charAt(0)-'0';
        String currChoices= kp[currNum];
        for(int i=0;i<currChoices.length();i++){
            combinations(str.substring(1),kp,res+currChoices.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String which containing only digits from 2-9 inclusive");
        String str=sc.next();
        String[] keyPad ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.println("All possible letter combinations that the number could represent are:-");
        combinations(str,keyPad,"");
    }
}
/*
   TC = time taken by one recursive call * no of recursive calls
      =            n                     *          4^n
      =          n*4^n
 */
