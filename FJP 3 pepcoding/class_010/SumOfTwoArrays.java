package class_010;
import java.util.Scanner;

public class SumOfTwoArrays{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[] args){
        // input first array
        int sizeOfA=scn.nextInt();
        int[] A=inputArray(sizeOfA);
        // input second array
        int sizeOfB=scn.nextInt();
        int[] B=inputArray(sizeOfB);

        // compute results
        int[] ans =SumTwoArrays(A, B);
        for(int val:ans){
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
    // function for adding two arrays
    public static int[] SumTwoArrays(int[] A,int[] B){
        int size=A.length;
        if(A.length<B.length) size=B.length;

        int[] ans=new int[size];
        int carry=0,sum=0;

        int i=A.length-1;
        int j=B.length-1;
        int k=size-1;

        while(k>-1) {
            if(i>=0) sum+=A[i];
            if(j>=0) sum+=B[j];
            sum+=carry;
            
            ans[k]=sum%10;
            carry=sum/10;

            // update values
            sum=0;
            --i;--j;--k;
        }
        if(carry>0) System.out.println(carry);
        return ans;
    }
}