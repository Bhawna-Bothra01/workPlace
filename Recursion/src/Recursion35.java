//Given an array of integers, print sums of all subsets in it.Output sums can be printed in any order.
import java.util.Scanner;
public class Recursion35 {
    static void sumOfSubsets(int[] a,int idx,int sum){
        if(idx==a.length) {
            System.out.println(sum);
            return;
        }
        sumOfSubsets(a,idx+1,sum+a[idx]);
        sumOfSubsets(a,idx+1,sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.print("Enter "+size+" elements of array: ");
        for(int i=0;i<size;i++) a[i]=sc.nextInt();
        System.out.println("Sums of all subsets in it are:-");
        sumOfSubsets(a,0,0);
    }
}
