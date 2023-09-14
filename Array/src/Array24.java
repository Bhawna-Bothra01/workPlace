/*Check if we can partition the array into two subarrays with equal sum. More formally, check that the prefix sum of a
part of the array is equal to the suffix sum of rest of the array*/
import java.util.Scanner;
public class Array24 {
    static int findArraySum(int [] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
            totalSum+=arr[i];
        return totalSum;
    }
    static boolean equalSumPartition(int [] arr){
        int totalSum= findArraySum(arr);
        int prefSum=0,i=0;
        while(i<arr.length){
            prefSum+=arr[i];
            int suffixSum=totalSum-prefSum;
            if(suffixSum==prefSum)
                return true;
            i++;
        }
        return false;
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible: "+equalSumPartition(arr));
    }
}
