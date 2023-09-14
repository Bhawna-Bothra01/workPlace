//countSort using prefix Sum
import java.util.Scanner;
public class Sorting8 {
    static void display(int [] arr){
        for(int i : arr) System.out.print(i+" ");
        System.out.println();
    }
    static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static void prefixSumArray(int [] count){
        int n=count.length;
        for(int i=1;i<n;i++){
            count[i] += count[i-1];
        }
    }
    static void countSort(int[] arr){
        int max = findMax(arr);
        int[] count = new int[max+1];
    for(int i=0;i< arr.length;i++){ //Make frequency array --> TC --> n
            count[arr[i]] += 1;
        }
        prefixSumArray(count); // TC --> max
        int [] output = new int[arr.length];
        int i=arr.length-1;
        while(i>=0){  // TC --> n
            output[count[arr[i]] - 1]=arr[i];
            count[arr[i]] -= 1;
            i--;
        }
        for(i=0;i<arr.length;i++){ // TC --> n
            arr[i] = output[i];
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********Unordered List********");
        display(arr);
        countSort(arr);
        System.out.println("********Sorted List********");
        display(arr);
    }
    /*

                        WC --> (n + max)
        TC -->          AC --> (n + max)
                        BC --> (n)

        -->As we can see that it is linear but not as efficient as merge sort and quick sort
        To understand this let's see one example:-
        we have an array of length 4 :-  1  2  10^9  4
        as we know that time complexity depends on maximum element in the array so in this example input size is very
        small but maximum element is very large so the time complexity is very greater in this condition also
        -->So this sorting algorithm works good when the range is defined and range is short
        --> Time complexity is O(n + max)

     */
}
