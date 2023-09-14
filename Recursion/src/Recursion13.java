//Given an array print all its values recursively.
import java.util.Scanner;
public class Recursion13 {
    static void printArray(int[] arr,int i){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        printArray(arr,i+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of the array are: ");
        printArray(arr,0);
    }
}
