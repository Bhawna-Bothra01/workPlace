/*rotate the given array 'a' by k steps.where k is non-negative without using extra space.*/
import java.util.Scanner;
public class Array15 {
    static void printArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void shiftArray(int[] arr)
    {
        int temp;
        int n=arr.length;
        temp=arr[n-1];
       for(int i=n-1;i>0;i--)
       {
           arr[i]=arr[i-1];
       }
       arr[0]=temp;
    }
    static void rotateArray(int[] arr,int k)
    {
        int p=1;
        while(p<=k)
        {
            shiftArray(arr);
            p++;
        }
        printArray(arr);
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
        System.out.println("Array before rotation");
        printArray(arr);
        System.out.println("Enter number of times of rotation");
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
