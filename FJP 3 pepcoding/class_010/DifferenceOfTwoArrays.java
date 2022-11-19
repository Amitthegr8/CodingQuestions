package class_010;
import java.util.Scanner;

public class DifferenceOfTwoArrays{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[] args){
        // input first array
        int sizeOfA=scn.nextInt();
        int[] A=inputArray(sizeOfA);
        // input second array
        int sizeOfB=scn.nextInt();
        int[] B=inputArray(sizeOfB);

        // compute results
        int[] ans =DifferenceTwoArrays(A, B);
        
        // EDGE CASES

        // 1. first non zero index - fnzi
        int fnzi=-1;
        for(int i=0; i<ans.length; ++i){
            if(ans[i]!=0){
                fnzi=i;
                break;
            }
        }
        // 2. absence of any non-zero index
        if(fnzi==-1) System.out.println(0);
        else for(int i=fnzi;i<ans.length;++i){
            System.out.println(ans[i]);
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
    // function for difference of two arrays where B > A
    public static int[] DifferenceTwoArrays(int[] A,int[] B){
        int size=B.length;
        // if(A.length<B.length) size=B.length;

        int[] ans=new int[size];
        // int carry=0,sum=0;
        int borrow=0, diff=0;

        int i=A.length-1;
        int j=B.length-1;
        int k=size-1;

        while(k>-1) {
            diff+=B[j];
            if(i>=0) diff-=A[i];
            diff-=borrow;
            
            if(diff<0) {
                borrow=1;
                diff+=10;
            } else borrow=0;

            ans[k]=diff;

            // update values
            diff=0;
            --i;--j;--k;
        }
        // if(carry>0) System.out.println(carry);
        return ans;
    }
}