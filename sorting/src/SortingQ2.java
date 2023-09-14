/*
  Given an array of names of the fruits; you are supposed to sort it in lexicographical order
  using the selection sort

  Lexicographical order, also known as alphabetical order, is a way of arranging words or strings
  based on the alphabetical order of their characters. In lexicographical order, words are sorted
  according to the sequence of letters in the standard dictionary
 */
import java.util.Scanner;
public class SortingQ2 {
    static void sortedString(String[] str){
        int n=str.length;
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i+1;j<=n-1;j++){
                if(str[min].compareTo(str[j])>0){
                    min=j;
                }
            }
            if(min!=i){
                String temp=str[min];
                str[min]=str[i];
                str[i]=temp;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the "+size+" string elements of the array");
        String[] str=new String[size];
        for(int i=0;i<size;i++){
            str[i]=sc.next();
        }
        System.out.println("********ORIGINAL ARRAY********");
        for(String i: str){
            System.out.print(i+" ");
        }
        System.out.println();
        sortedString(str);
        System.out.println("********SORTED ARRAY********");
        for(String i: str){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
/*
   s1.compareTo(s2) if s1<s2 then this method will return negative number
                    if s1>s2 then this method will return positive number
                    if s1==s2 then this method will return zero
 */
