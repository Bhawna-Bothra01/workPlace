/*Find the unique number in a given Array where all the elements are being
* repeated twice with one value being unique*/
import java.util.Scanner;
public class Array10 {
    void uniqueNum(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }

            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                ans=arr[i];
                System.out.println("Unique number in the array is "+ans);
            }
        }
        if(ans==0)
        System.out.println("No unique number");

    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=obj.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array where all the elements are being repeated twice with one value " +
                "being unique and all element should be positive");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=obj.nextInt();
        }
        Array10 ar=new Array10();
        ar.uniqueNum(arr);
    }
}
