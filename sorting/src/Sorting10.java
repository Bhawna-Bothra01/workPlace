//Bucket Sort Algorithm
//Sort an array having numbers in range [0.0,0.1] with uniform distribution.Tell efficient algorithm to solve
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Sorting10 {
    static void display(float [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void bucketSort(float [] arr){
        int n = arr.length;
        //Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        //Create empty buckets
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<Float>();
        }
        //Add elements into buckets
        for(int i=0;i<buckets.length;i++){
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        //sort each bucket individually
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        //Merge all buckets to get final sorted array
        int index=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++] = currBucket.get(j);
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n=sc.nextInt();
        float [] arr=new float[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextFloat();
        }
        System.out.println("********Unordered List********");
        display(arr);
        bucketSort(arr);
        System.out.println("********Sorted List********");
        display(arr);
    }
}
/*
    -->Bucket Sort is used when elements of array given is uniformly distributed
    -->Put all elements in b number of buckets
    -->Sort each bucket individually
    -->Take out all elements and join them
    -->To sort any bucket we can use any sorting algorithm
    -->Number of bucket is decided by you only
    -->Time Complexity:-
        ->In best case we get individually uniform distribution of every buckets
          TC: O(n+k) where n is number of element in array and k is number of buckets
        ->In worst case all element is present in one buckets then here time complexity will depend on sorting algorithm
          used to sort each bucket
 */
