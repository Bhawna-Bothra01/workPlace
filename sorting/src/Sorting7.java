//Count Sort
import java.util.Scanner;
public class Sorting7 {
    static int findMax(int []arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }
    static void countSort(int[] arr){
        //find the largest element in the given array
        int max=findMax(arr);
        /*int max=arr[0];
        for(int x : arr)
        {
            if(x>max){
                max=x;
            }
        }*/
        int[] frequencyArray = new int[max+1];
        for(int i=0;i<arr.length;i++){
            frequencyArray[arr[i]]+=1;
        }
        int i=0,j=0;
        while(i<arr.length){
            while(frequencyArray[j]>0){
                arr[i]=j;
                frequencyArray[j]-=1;
                i++;
            }
            j++;
        }
    }
    static void display(int[] arr){
        int n=arr.length;
        for(int v : arr){
            System.out.print(v+" ");
        }
        System.out.println();
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
}
/*
    1.Count sort is non-comparison based Algorithm
    2.Range of number is defined
    3.Not an Inplace algorithm
    4.Under certain situation count sort perform better that O(nlogn)
    5.Using the concept of frequency array

    Disadvantage of this method is that we can't sort object by using this method and stability property is sacrificed

    Why stability is so important?
    Ans:-
        unsorted        time wise sorted        city wise sorted and it should be stable to maintain time wise sorted in a city
        BLR , 2         BLR , 2                 BLR , 2
        Mumbai , 5      Mumbai , 5              BLR , 7
        BLR , 13        BLR , 7                 BLR , 13
        Mumbai , 10     Mumbai , 10             Mumbai , 5
        BLR , 7         BLR , 13                Mumbai , 10

        Here, when we are sorting string if we use unstable algorithm then there is chances that BLR , 7 comes before
        BLR , 2 or BLR , 13 comes before BLR , 7

        in many situation we need stability
*/
//int max=Integer.MIN_VALUE;
/*done by ma'am
    int k=0;
    for(int i=0;i<frequencyArray.length;i++){
        for(int j=0;j<count[i];j++{
            arr[k++]=i;
        }
    }
 */
