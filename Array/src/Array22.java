/*Given an integer array 'a',return the prefix sum/running sum in the same array without creating a new array*/
import java.util.Scanner;
public class Array22 {
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void prefixArray(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the elements of array in non-decreasing order");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is: ");
        printArray(arr);
        prefixArray(arr);
        System.out.println("Prefix sum array is: ");
        printArray(arr);
    }
}
