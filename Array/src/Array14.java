//Reverse an array consisting of integer values.
import java.util.Scanner;
public class Array14 {
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swapArray(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int []arr)
    {
       int i=0,j=arr.length-1;
       while(i<j)
       {
           swapArray(arr,i,j);
           i++;
           j--;
       }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Given array is ");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Reverse array is ");
        printArray(arr);
    }
}
