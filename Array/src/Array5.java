//Check if the given array is sorted or not.
import java.util.Scanner;
public class Array5 {
    //ascending order
    static int sortedOrNot1(int[] arr)
    {
        int flag=0;                  // 0   1  2  3  4
        for(int i=1;i<arr.length;i++)// 12 13 14  15 16
        {
            if(arr[i]<arr[i-1])//i=1 13<12 F i=2 14<13 F i=3 15<14 F i=4 16<15 F
            {
                flag=1;
                break;
            }
        }
        return flag;
    }
    // descending order
    static int sortedOrNot2(int[] arr)
    {
        int flag=0;
        for(int i=1;i<arr.length;i++)//12 13 14 16 15
        {
            if(arr[i]>arr[i-1])// i=1 13>12
            {
                flag =1;
                break;
            }
        }
        return flag;
    }

   public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        if((sortedOrNot1(arr)+sortedOrNot2(arr))==2)
            System.out.println("Array is not sorted");
        else
            System.out.println("Array is sorted");
    }
}
