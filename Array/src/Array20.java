/*arrange the give array in such a way that every even number present in the array is in the beginning followed
by all odd numbers*/
import java.util.Scanner;
public class Array20 {
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
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] evenOdd(int[] arr)
    {
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right) {
            if ((arr[left] % 2 != 0) && (arr[right] % 2 == 0)) {
                swapArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0)
                left++;
            if (arr[right] % 2 != 0)
                right--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Original array ");
        printArray(arr);
        System.out.println("Array after arranging it according to condition ");
        printArray(evenOdd(arr));
    }
}
