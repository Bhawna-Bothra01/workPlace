//When we copy array a1 from array a2 then a2 will not change if we will change array a1
import java.util.Scanner;
public class Array1 {
    static void printArray(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]+" ");

       }
       System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of 'n'");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);
        int[] arr_2=arr.clone();
        System.out.println("Copied array");
        printArray(arr_2);
        arr_2[0]=0;
        arr_2[2]=0;
        System.out.println("After changing the value of copied array original array is ");
        printArray(arr);
        System.out.println("After changing the value of copied array copied  array is  ");
        printArray(arr_2);
        arr[0]=89;
        arr[4]=69;
        System.out.println("After changing the value of original array original array is ");
        printArray(arr);
        System.out.println("After changing the value of original array copied  array is  ");
        printArray(arr_2);

    }
}
