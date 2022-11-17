package class_009;

import java.util.Scanner;

public class P003_Reverse {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        int i=0, j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            ++i; --j;
        }
        // print new array reversed
        for(int val:arr){
            System.out.print(val+", ");
        }
    }
}
