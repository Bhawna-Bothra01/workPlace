//Given an array arr of size N and an integer X.The task is to find all the indices of the integer X in the array.
// Use Arraylist to store indices.
import java.util.Scanner;
import java.util.ArrayList;
public class Recursion19 {
    static ArrayList<Integer> findAllIndices(int[] arr,int target,int idx){
        if(idx==arr.length) return new ArrayList<Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target) ans.add(idx);
        ArrayList<Integer> smallAns=findAllIndices(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int target = sc.nextInt();
        ArrayList<Integer> ans=findAllIndices(arr,target,0);
        if(ans.size()==0){
            System.out.println(target+" is not found in array");
            return;
        }
        System.out.print(target+" is found at indices ");
        for(Integer i: ans){
            System.out.print(i+" ");
        }
    }
}

