//Insertion sort ,in this we have two parts one is sorted and another one is unsorted
// we take one element from unsorted part and place it into the correct position in sorted part
import java.util.Scanner;
public class Sorting4 {
    static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
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
        insertionSort(arr);
        System.out.println("********SORTED ARRAY********");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
/*
  Real life example:-
                      1. shirts
                      2. cards
  sorted |  unsorted    principle: Take one element from unsorted part,
                                   iterate through the sorted and find the
                                   correct position of this element
    Time Complexity:-
    i=1 j loop will work for 1 time
    i=2 j loop will work for 2 times
    i=3 j loop will work for 3 times
    .
    .
    .
    .
    i=n-1 j loop will work for (n-1) times
    T.C.= 1+2+3+4+....+(n-1) = n(n-1)/2 ~ n^2
    Time Complexity=O(n^2) // for worst case
                    Omega(n) // for best case
     it is in-place algorithm and stable
     space Complexity is O(1)
 */
