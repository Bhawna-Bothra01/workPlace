//print the max value of the array given: arr.length>=1
import java.util.Scanner;
public class Recursion14 {
    static int maxInArray(int[] arr,int idx){
        if(idx==arr.length-1) return arr[idx];
        int max=maxInArray(arr,idx+1);
        return Math.max(arr[idx],max);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum element in the array is "+maxInArray(arr,0));
    }
}
