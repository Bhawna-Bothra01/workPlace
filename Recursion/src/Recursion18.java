//Given an array arr of size N and an integer X.The task is to find all the indices of the integer X in the array.
import java.util.Scanner;
public class Recursion18 {
    static void findAllIndices(int[] arr,int target,int idx){
        if(idx==arr.length) return;
        if(arr[idx]==target) System.out.print(idx+" ");
        findAllIndices(arr,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int target = sc.nextInt();
        System.out.print(target+" is found at indices ");
        findAllIndices(arr,target,0);
    }
}
