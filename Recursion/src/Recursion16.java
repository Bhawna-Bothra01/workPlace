//Given an array of n integers and a target value x. Print whether x exists in the array or not.
import java.util.Scanner;
public class Recursion16 {
    static boolean searchElement(int[] arr,int key,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==key) return true;
        return searchElement(arr,key,idx+1);
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
        int key=sc.nextInt();
        if(searchElement(arr,key,0)) System.out.println("YES "+key+" is in the array");
        else System.out.println("NO "+key+" is not found in the array");
    }
}
