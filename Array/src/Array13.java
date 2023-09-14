//Reverse an array consisting of integer values.
import java.util.Scanner;
public class Array13 {
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] reverseArray(int []arr)
    {
        int n=arr.length;
        int[] arr1=new int[n];
        for(int i=0,j=n-1;i<=n-1;i++,j--) {
            arr1[i] = arr[j];
        }
        return arr1;
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
        int []arr1=reverseArray(arr);
        System.out.println("Reverse array is ");
        printArray(arr1);
    }
}
