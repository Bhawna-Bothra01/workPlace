//BubbleSort Algorithm (improving time complexity for best case )
import java.util.Scanner;
public class Sorting2{
    static void sortArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) return;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr=new int[size];
        for(int i=0;i<size;i++) arr[i]=sc.nextInt();
        System.out.println("ORIGINAL ARRAY");
        for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("SORTED ARRAY");
        sortArray(arr);
        for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
}
/*
   Stable Sort and Unstable Sort
   5 4 3 2 3*
   stable: 2 3 3* 4 5
   unstable: esh case mai output koi bhi aa sakta hai
             2 3* 3 4 5
             2 3 3* 4 5
   BubbleSort is stable sort
   BubbleSort is in-place algorithm
   time complexity in best case is O(n)
 */