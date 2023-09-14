//Given an array of size N containing only 0s,1s,and 2s;sort the array in ascending
import java.util.Scanner;
public class SortingQ5 {
    static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortArray(int [] arr){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements as per the questions");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********Input List********");
        display(arr);
        sortArray(arr);
        System.out.println("********Sorted List********");
        display(arr);
    }
}
