//Find last index of target in arr.
import java.util.Scanner;
public class Recursion23 {
    static int lastIndexOfTarget(int[] arr,int target,int idx){
        if(idx==0){
            if(arr[idx]==target) return idx;
            return -1;
        }
        if(arr[idx]==target) return idx;
        return lastIndexOfTarget(arr,target,idx-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int target = sc.nextInt();
        int result=lastIndexOfTarget(arr,target,n-1);
        if(result<0) System.out.print(target+" is not in the array");
        else System.out.print(target+" is found and the last index in array is "+result);
    }
}
