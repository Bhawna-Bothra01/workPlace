import java.util.Scanner;

//to find the kth largest or smallest element
public class Array7 {
    static void printArray(int[] arr,int size)
    {
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    static int deleteDuplicates(int[] arr)
    {
        int size=arr.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    for(int k=j;k<size-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    j--;
                    size--;
                }

            }
        }
        return size;
    }
    static int[] bubbleSort(int[] arr,int size)
    {
        int temp;
        for(int i=1;i<=size-1;i++)
        {
            for(int j=1;j<=size-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    static int kthLargestElement(int[] arr,int kth,int size)
    {
        int[] arr1=bubbleSort(arr,size);
        if(kth>size)
        {
            return 0;
        }
        return arr1[size-kth];
    }
    static int kthSmallestElement(int[] arr,int mth,int size)
    {
        int[] arr1=bubbleSort(arr,size);
        if(mth>size)
        {
            return 0;
        }
        return arr1[mth-1];
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
        System.out.println("Before deleting the duplicates");
        printArray(arr,size);
        System.out.println("After deleting the duplicates");
        int size1=deleteDuplicates(arr);
        printArray(arr,size1);

        System.out.println("Enter which largest number you want , for example 2th 3th 5th largest");
        int kth=sc.nextInt();
        System.out.println("Enter which Smallest number you want , for example 2th 3th 5th smallest");
        int mth=sc.nextInt();
        int kthLarge=kthLargestElement(arr,kth,size1);
        int mthSmall=kthSmallestElement(arr,mth,size1);
        if (kthLarge==0)
        {
            System.out.println("largest number you want does not exist");
        }
        else {
            System.out.println("Largest number you want " + kthLarge);
        }
        if(mthSmall==0)
        {
            System.out.println("Smaller number you want does not exist");
        }
        else {
            System.out.println("Smallest number you want " + mthSmall);
        }
    }
}
