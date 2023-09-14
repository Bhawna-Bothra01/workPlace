//Merge Sort Algorithm :This is a  Divide and Conquer algorithm ,i.e, bigger problem is divided into
// smaller problems and we find answers for smaller problem to solve bigger problem
import java.util.Scanner;
public class Sorting5 {
    static void displayArr(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=arr[l+i];
        for(j=0;j<n2;j++) right[j]=arr[mid+1+j];
        i=0;j=0;k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];
    }
    static void mergeSort(int[] arr,int l ,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
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
        displayArr(arr);
        System.out.println();
        mergeSort(arr,0,size-1);
        System.out.println("********SORTED ARRAY********");
       displayArr(arr);
    }
}
/*
  1. Divide the array into 2 equal halves.
  2. Sort the 2 subarrays separately using recursion.
  3. Merge the 2 sorted subarrays to create an overall sorted array.
    Time Complexity:
                     By substitution method:-
                                                      c,          n=1
                                              T(n)=
                                                      2T(n/2)+n,  n>1
                                              .
                                              .
                                              .
                                              T(n) ~ O(nlog(n)) in all case
    Space Complexity:
                      Number of stack frames=log(n)
                      SC=O(n(this n is the space occupied by frame stack)+log(n)) ~ O(n)
    it is stable algorithm
 */
