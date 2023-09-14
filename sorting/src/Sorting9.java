//Radix Sort
import java.util.Scanner;
public class Sorting9 {
    static void display(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void prefixSumArray(int [] frequencyArray){
        int n=frequencyArray.length;
        for(int i=1;i<n;i++){
            frequencyArray[i] += frequencyArray[i-1];
        }
    }
    static void countSort(int [] arr, int place){
        int [] frequencyArray = new int[10];
        for(int i=0;i<arr.length;i++){
            frequencyArray[(arr[i]/place)%10]++;
        }
        prefixSumArray(frequencyArray);
        int []temp = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            temp[frequencyArray[((arr[i]/place)%10)]-1] = arr[i];
            frequencyArray[((arr[i]/place)%10)]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
    }
    static void radixSort(int [] arr){
        int max = findMax(arr);
        for(int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********Unordered List********");
        display(arr);
        radixSort(arr);
        System.out.println("********Sorted List********");
        display(arr);
    }
}
/*
    -->It is also a non-comparison based algorithm just like count sort
    -->Here sorting is done digit by digit to sort the full array
    -->     170 045 075 090 802 002 (given array)
            170 090 802 002 045 075 (ones place sorting)
            802 002 045 170 075 090 (tens place sorting)
            002 045 075 090 802 170 (hundreds place sorting)
            in each step we are sorting with the help of counting sort
    --> Time Complexity of radix Sort Algorithm:-
        static void radixSort(int [] arr){
        int max = findMax(arr); // O(n)
        for(int place=1;max/place>0;place*=10){ //O(d*n) d is number of digit present in max element present in the array
            countSort(arr,place); //O(n+10) ~ O(n)
        }
    }
    -->TC : O(d(n+k)) ~ O(d*n) where d is number of digit in maximum element of array and n is the input size
    -->SC : O(n+10) ~ O(n)
    -->It is not in place algorithm
 */
