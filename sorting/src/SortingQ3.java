/*Given an array where all its elements are stored in increasing order except two swapped elements, sort it in linear
  time. Assume there are no duplicates in the array.*/
import java.util.Scanner;
public class SortingQ3 {
    static void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sort(int[] arr){
        int n=arr.length,x=-1,y=-1;
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements as per the questions");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********Input List********");
        display(arr);
        sort(arr);
        System.out.println("********Sorted List********");
        display(arr);
    }
}
