//Count the number of triples whose sum is equal to the given value x.
import java.util.Scanner;
public class Array9 {
    int[] arr;
    int target;
    public Array9(int[] ar,int n)
    {
        arr=ar;
        target=n;
    }
    void SumTriplets()
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[k])==target)
                    {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of pairs that has sum "+target+" is "+count);
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
        System.out.println("Enter Sum target");
        int target=sc.nextInt();
        Array9 ar=new Array9(arr,target);
        ar.SumTriplets();
    }
}
