/*Given an array of positive and negative integers, segregate them in linear time and constant space. The output should
  print all negative numbers, followed by all positive numbers.
 */
import java.util.Scanner;
public class SortingQ4 {
    static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void partition(int [] arr){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<=right){
            while(arr[left]<0) left++;
            while(arr[right]>=0) right--;
            if(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements as per the questions");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********Input List********");
        display(arr);
        partition(arr);
        System.out.println("********Sorted List********");
        display(arr);
    }
}
