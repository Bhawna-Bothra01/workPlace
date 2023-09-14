//Find the sum of element of the array.
import java.util.Scanner;
public class Recursion15 {
    static int sumArray(int[] arr,int idx){
        if(idx==arr.length-1) return arr[idx];
        return arr[idx]+sumArray(arr,idx+1);
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
        System.out.print("Sum of elements in the array is "+sumArray(arr,0));
    }
}
