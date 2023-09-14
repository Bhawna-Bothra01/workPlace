//Count the number of occurrences of a particular element x.
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int count=0;
        int[] arr={1,4,5,1,2,2,6,7,8,2,3,4,6,7,9,8,7,4,7,7,5,8};
        for(int i: arr)
        {
            if(num==i)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println(num+" is not present in the array");
        }
        else
            System.out.println("The number of occurrences of "+num+" in the array is "+count);
    }
}
