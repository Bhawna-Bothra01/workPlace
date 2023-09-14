//Implement isSorted method this method tell us whether the given array is sorted or not. print Yes or no.
import java.util.Scanner;
public class Recursion22 {
    static boolean isSorted(int[] arr,int idx){
        if(idx==arr.length-1) return true;
        if(arr[idx]>arr[idx+1]) return false;
        return isSorted(arr,idx+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the list");
        int n=sc.nextInt();
        System.out.println("Enter the element of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Is array is sorted ?");
        if(isSorted(arr,0)) System.out.print("YES");
        else System.out.print("NO");
    }
}
