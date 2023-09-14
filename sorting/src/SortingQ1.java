/*
  Given an integer array arr, move all 0's to the end of it while maintaining the relative
  order of the non-zero elements.

  Note that you must do this in-place without making a copy of the array
 */
import java.util.Scanner;
public class SortingQ1 {
    static void getRequiredOrder(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0&&arr[j+1]!=0){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(!flag) return;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("********ORIGINAL ARRAY********");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        getRequiredOrder(arr);
        System.out.println("********REQUIRED ORDER OF ARRAY********");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
