/*sort an array consisting of zeroes and ones*/
import java.util.Scanner;
public class Array19 {
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
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int[] sortZeroesOnes(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0)
                left++;
            if (arr[right] == 1)
                right--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        System.out.println("Enter the elements of array which consist only 1 and 0");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        printArray(arr);
        System.out.println("Array after sorting");
        printArray(sortZeroesOnes(arr));
    }
}
