//Rectangular pattern
/* FOR EXAMPLE:
                1 2 3 4 5 6
                1 2 3 4 5 6
                1 2 3 4 5 6
                1 2 3 4 5 6

 */
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
