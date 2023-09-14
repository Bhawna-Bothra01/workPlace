/*Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of
indices from 1 to r(both included)*/
import java.util.Scanner;
public class Array23 {
    static int[] prefixArray(int []arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int[size+1];
        System.out.println("Enter the elements of array in non-decreasing order");
        for(int i=1;i<=size;i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1=prefixArray(arr);
        System.out.println("Enter the number of queries");
        int q=sc.nextInt();
        while(q>0) {
            System.out.println("Enter the lower limit");
            int ll = sc.nextInt();
            System.out.println("Enter the upper limit");
            int ul = sc.nextInt();
            System.out.println("Required sum is ");
            System.out.print(arr[ul] - arr[ll - 1]);
            System.out.println();
            q--;
        }
    }

}
