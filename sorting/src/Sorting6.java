/*QuickSort is a widely used sorting algorithm that employs a divide-and-conquer strategy to sort
 an array or list of elements.
 */
import java.util.Scanner;
public class Sorting6 {
    static void swap(int[] arr,int x,int y){
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int low,int high){
        int pivotInd=low,i=low+1,j=high;
        while(i<=j){
            while(i<=high&&arr[pivotInd]>=arr[i]) i++;
            while(j>=low&&arr[pivotInd]<arr[j]) j--;
            if(i<j) swap(arr,i,j);
        }
        if(j<i) swap(arr,pivotInd,j);
        return j;
    }
    static void QuickSort(int[] arr,int low,int high){
        if(low<high){
            int pivotInd = partition(arr,low,high);
            QuickSort(arr,low,pivotInd-1);
            QuickSort(arr,pivotInd+1,high);
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
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        QuickSort(arr,0,n-1);
        System.out.println("********Sorted List********");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
 /*
    Time Complexity :-
                       Worst Time Complexity = O(n^2)
                       Best Time Complexity = O(nlogn)
                       Average Time Complexity = O(nlogn)
    QuickSort is inplace and unstable Algorithm
    Space Complexity :-
                         Average and Best Space complexity = O(logn)
                         Worst Space Complexity = O(n);
    Calculating Time Complexity by substitution method:-
                                      For best case:-
                                      T(n) = 2*T(n/2)+n -> T(n) = (2^k * T(n/2^k) )+ (n*K)-> T(n)=(2^logn * T(1))+(n*logn)
                                      ->T(n)= n*c + n*logn-> T(n) ~ nlogn//('n' which is added over here
                                      is time complexity for partition method we have used)
                                      For Average case:-
                                      T(n) = avg( T(pivotInd - 1) + T(n - pivotInd) )+ n -> T(n) ~ nlogn
                                      For Worst case:-
                                      T(n) = T(n-1) + n -> T(n)=T(n-k) + k*n - (1+2+3+4+....+9k-1))-> T(n) = T(n-k) + kn - k(k-1)/2
                                      -> T(n)= T(1) + n*n - n(n-1)/2-> T(N) ~ c + n^2 + n^2 -> T(n) ~ n^2

 */