//BubbleSort Algorithm it is a Bruteforce method
// we use two loops one is for different phase and one is for comparing each adjacent element
import java.util.Scanner;
public class Sorting1 {
    static void sortArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
    Time Complexity(TC) = ?
    if i=0 ,then j loop is working for n-1 times
    if i=1 ,then j loop is working for n-2 times
    if i=2 ,then j loop is working for n-3 times
    if i=3 ,then j loop is working for n-4 times
    .
    .
    .
    .
    if i=n-2, then j loop will iterate for 1 time
    TC=(n-1)+(n-2)+(n-3)+(n-4)+......+(n-(n-1))
      =n(n-1)-(1+2+3+4+.......n-1)
      =n(n-1)-n(n-1)/2
      =n(n-1)/2
      ~n^2
    Therefore, Time complexity=O(n^2) for every case(worst,average,best)
 */