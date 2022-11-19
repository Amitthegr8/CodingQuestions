package class_011;
import java.util.Scanner;

public class InverseArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        arr=inputArray(n);

        int[] B=new int[n];
        for(int i=0; i<arr.length; ++i){
            B[arr[i]]=i;
        }
        arr=B;
        for(int val:arr){
            System.out.println(val);
        }
    }
    
    // function for inputting arrays
    public static int[] inputArray(int n){
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
}