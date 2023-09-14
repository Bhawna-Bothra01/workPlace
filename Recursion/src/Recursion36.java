/*There are N stones, numbered 0,1,2,.......,N-1.For each i(0<=i<N), the height of Stone i is hi. There is a frog who is
 initially on Stone 0. He will repeat the following action some number of times to reach Stone N-1:
 If the frog is currently on stone i,jump to Stone i+1 or Stone i+2. Here , a cost of |hi-hj| is incurred, where j is
 the stone to land on.
 Find the minimum possible total cost incurred before the frog reaches Stone N.
 */
import java.util.Scanner;
public class Recursion36 {
    static int totalCost(int [] h,int idx){
        if(idx==h.length-1) return 0;
        int opt1=totalCost(h,idx+1)+Math.abs(h[idx]-h[idx+1]);
        if(idx==h.length-2) return opt1;
        int opt2=totalCost(h,idx+2)+Math.abs(h[idx]-h[idx+2]);
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stones");
        int n = sc.nextInt();
        int[] h = new int[n];
        System.out.println("Enter the height of " + n + " stones");
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        System.out.println("TOTAL COST: Rs." + totalCost(h, 0));
    }
}
/*
 TC =O(2^n) where n is number of stones
 */