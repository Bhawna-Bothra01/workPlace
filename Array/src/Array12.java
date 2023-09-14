/*Given an array 'a' consisting of integers. Return the first value that is repeating in this array.If no value is being
repeated, return -1.*/
import java.util.Scanner;
public class Array12 {
   static int repeatFirst(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the positive element of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("The first repeated number in the array is " + repeatFirst(arr));
    }
}
