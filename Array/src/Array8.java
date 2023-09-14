//Find the total number  of pairs in the Array whose sum is equal to the given value x.
import java.util.Scanner;
public class Array8 {
    int[] arr;
    int num;
    public Array8(int[] ar,int n)
    {
        arr=ar;
        num=n;
    }
    void TotalSumPairs()
    {
        int count=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if((arr[i]+arr[j])==num)
               {
                   System.out.println(arr[i]+","+arr[j]);
                   count++;
               }
           }
       }
       System.out.println("Number of pairs that has sum "+num+" is "+count);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Array8 ar=new Array8(arr,num);
        ar.TotalSumPairs();
    }
}
