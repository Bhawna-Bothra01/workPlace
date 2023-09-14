//Largest and smallest Element of array
import java.util.Scanner;
public class Array6 {
    static int maxElement(int []arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    static int minElement(int []arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
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
        int max=maxElement(arr);
        System.out.println("Maximum element in the array is "+max);
        int min=minElement(arr);
        System.out.println("Minimum element in the array is "+min);

    }
}
