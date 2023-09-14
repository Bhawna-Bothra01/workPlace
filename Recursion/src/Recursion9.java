//Given a number num and a value k. Print k multiples of num.
import java.util.Scanner;
public class Recursion9 {
    static void multipleOfNumber(int num,int k){

        if(k==1){
            System.out.print(num+" ");
            return;
        }
        multipleOfNumber(num,k-1);
        System.out.print(num*k +" ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("Enter the number of multiples you want");
        int k=sc.nextInt();
        System.out.print(k+" multiples of "+num+" are ");
        multipleOfNumber(num,k);
    }
}
