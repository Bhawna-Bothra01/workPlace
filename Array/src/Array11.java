//Find the second-largest and second-smallest number
import java.util.Scanner;
public class Array11 {
    int[] arr;
    Array11(int [] a)
    {
        arr=a;
    }
//    void printArray()
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println();
//    }
    int findMax()
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    int findSecondMax()
    {
        int max=findMax();
        for(int i=0;i<arr.length;i++)
        {
            if(max==arr[i])
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return findMax();
    }
    int findMin()
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
    int findSecondMin()
    {
        int min=findMin();
        for(int i=0;i<arr.length;i++)
        {
            if(min==arr[i])
            {
                arr[i]=Integer.MAX_VALUE;
            }
        }
        return findMin();
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr1=arr.clone();
        Array11 a1=new Array11(arr);
        System.out.println("Largest element in the array is "+a1.findMax());
        System.out.println("Second largest element in the array is "+a1.findSecondMax());
//        arr[0]=0;
//        arr[5]=0;
//        a1.printArray();
        Array11 a2=new Array11(arr1);
//        a2.printArray();
        System.out.println("smallest element in the array is "+a2.findMin());
        System.out.println("Second smallest element in the array is "+a2.findSecondMin());

    }
}
