//Count the number of elements strictly greater than value x
import java.util.Scanner;
public class Array4 {
    static int noOfElementGreater(int[] arr,int num)
    {
        int count=0;
        for(int ar:arr)
        {
            if(num<ar)
            {
                count++;
            }
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
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(noOfElementGreater(arr,num)+" element is strictly greater than "+num);
    }
}
