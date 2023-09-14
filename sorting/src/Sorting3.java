//Selection sort ,in this algorithm of sorting we find the minimum element and place it in right place
import java.util.Scanner;
public class Sorting3 {
    static void swap(int x,int y){
        int temp=x;
        x=y;
        y=x;
    }
    static void selectionSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<=n-1;i++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            if(min_index!=i)
            swap(arr[min_index],arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********ORIGINAL ARRAY********");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("********SORTED ARRAY********");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
/*
  TIME COMPLEXITY:-
  i=0 , j loop is working for n-1 times
  i=1 , j loop is working for n-2 times
  i=2 , j loop is working for n-3 times
  .
  .
  .
  .
  .
  i=n-2, j loop is working for 1 times
  j loop is working for (1+2+3+.....+n-1)=n*(n-1)/2
  Time complexity=(n*(n-1)/2)
                 ~n^2
                 O(n^2) is time complexity
  Space complexity=O(1)
  its time complexity is same for all cases
  it is not stable :- for example: 4 10 4* 2 when we sort this by selection sort answer will be 2 4* 4 10
  yes selection sort is in-place algorithm as it is not taking any extra space
*/
