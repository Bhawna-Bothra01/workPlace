import java.util.Scanner;

//Given an array of n integers and a target value x.print the index at which the target is present.
public class Recursion17 {
    static int findIdx(int[] arr,int target,int idx){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
        return findIdx(arr,target,idx+1);
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
        int target= sc.nextInt();
        int idx=findIdx(arr,target,0);
        if(idx==-1) System.out.println(target+" is not found in the array");
        else System.out.println(target+" is found at "+idx+" location in the array");
    }
}
