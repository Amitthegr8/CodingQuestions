package class_010;
import java.util.Scanner;

public class ReverseArray{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[] args){
        // input array
        int sizeOfA=scn.nextInt();
        int[] A=inputArray(sizeOfA);

        // compute results
        A=revArray(A);
        for(int val:A){
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
    // function for reversing arrays
    public static int[] revArray(int[] arr){
        int i=0,size=arr.length;
        while(i<size/2){
            int temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;

            // update
            ++i;
        }
        return arr;
    }
}