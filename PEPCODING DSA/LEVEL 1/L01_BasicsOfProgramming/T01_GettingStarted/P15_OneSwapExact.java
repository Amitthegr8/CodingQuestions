package T01_GettingStarted;

import java.util.Scanner;

public class P15_OneSwapExact {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many digits: ");
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; ++i) {
            A[i] = scn.nextInt();
        }
        Solution(A);
        for(int val: A){
            System.out.print(val+" ");
        }
    }

    public static void Solution(int[] A) {
        int[] B = new int[10];
        for(int i=0;i<10;++i) B[i]=-1;
        int count=0;
        // store last location of each digit
        for (int i = 0; i < A.length ; ++i) {
            int digit = A[i];
            B[digit] = i;
        }
        // swap
        for(int i=0;i<A.length && count==0 ;++i){
            for(int j=9; j>A[i] ;--j){ // number is bigger
                if(B[j]>i){ // index of bigger num comes after
                    swap(A,i,B[j]);
                    ++count;
                    break;
                }
            }
        }
        if(count==1) return;
        else{
            int max1=A.length-1;
            int max2=-1; 
            int i;
            // if last digit repeats 755 => 575 and not 557 
            for(i=max1-1; A[i]==A[A.length-1]; --i){
                max1=i;
            }
            max2=i;
            // for(int i=1;i<10;++i){
            //     if(B[i]>max1) max1=B[i];
            // }
            // for(int i=1;i<10;++i){
            //     if(B[i]>max2 && B[i]!=max1) max2=B[i];
            // }
            swap(A,max1,max2);
        }
    }
    public static void swap(int[] A,int i,int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}
//5
// 9 8 7 6 9
// 