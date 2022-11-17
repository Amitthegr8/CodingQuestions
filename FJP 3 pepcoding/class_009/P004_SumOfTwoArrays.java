package class_009;

import java.util.Scanner;

public class P004_SumOfTwoArrays {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        // first array input
        int[] arr1=takeInputArray();

        // second array input
        int[] arr2=takeInputArray();
        
        // find sum
        int[] ans=arraySum(arr1, arr2);

        int i=0;
        if(ans[0]==0) i=1;
        for(;i<ans.length;++i){
            System.out.println(ans[i]);
        }
    }
    public static int[] takeInputArray(){
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        return arr;
    }

    public static int[] arraySum(int[] arr1, int[] arr2){
        int[] ans;
        int[] A,B; // A=small, B=large
        A=arr1;
        B=arr2;
        if(A.length> B.length){
            A=arr2;
            B=arr1;
        }
        // size of ans is greater or equal to bigger array
        ans=new int[B.length+1];

        int carry=0,num;
        // exhaust smaller array
        for(int i=0;i<A.length;++i) {
            num=A[A.length-1-i]+B[B.length-1-i]+carry;
            carry=num/10;  
            ans[ans.length-1-i]=num%10;
        }
        // exhaust larger array
        for(int i=A.length;i<B.length;++i){
            num=B[B.length-1-i]+carry; // if b.length=a.length loop will not run
            carry=num/10;  
            ans[ans.length-1-i]=num%10;
        }
        ans[0]=carry;
        return ans;
    }
}
