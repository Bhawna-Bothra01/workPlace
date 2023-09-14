/*rotate the given array 'a' by k steps.where k is non-negative without using extra space.*/
import java.util.Scanner;
public class Array16 {
    static void printArray(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr,int i,int j)
    {
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int[] arr,int i,int j)
    {
        while(i<j)
        {
            swapArray(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateArray(int[] arr,int k)
    {
        int n=arr.length;
        reverseArray(arr,0,n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
        printArray(arr);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before rotation");
        printArray(arr);
        System.out.println("Enter the number of times you want to rotate");
        int k=sc.nextInt();
        k=(k%size);
        if(k==0)
        {
            System.out.println("Array after rotation");
            printArray(arr);
            return;
        }
        System.out.println("Array after rotation");
        rotateArray(arr,k);
    }
}
