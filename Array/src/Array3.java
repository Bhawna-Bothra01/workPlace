//Find the last occurrence of an element x in a given array.
import java.util.Scanner;
public class Array3 {
    //static void enterArray(int size)
   // {

  //  }
    static int lastOccur(int [] arr,int num)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            count=i+1;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of array");
        //enterArray(size);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number whose last occurrence you want to find");
        int num=sc.nextInt();
        int count=lastOccur(arr,num);
        if(count==0)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("The last occurrence of "+num+" is at "+count);
        }
    }
}
