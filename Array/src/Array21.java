/*Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non
* -decreasing order*/
import java.util.Scanner;
public class Array21 {
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverseArray(int [] ans){
        int i=0;
        int j=ans.length-1;
        int temp;
        while(i<j){
            temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;
        }
    }
    static int[] squareSort(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int k=0;
        int[] ans=new int[n];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String [] args){
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
        int[] ans=squareSort(arr);
        System.out.println("After sorting square of original array in non-decreasing order");
        reverseArray(ans);
        printArray(ans);
    }
}
