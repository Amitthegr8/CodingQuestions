package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P11_SumOfTwoArrays {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] A=inputArray();
        int[] B=inputArray();
       
        int[] ans=sumOfArray(A,B);
        displayArray(ans);
        scn.close();
    }
    public static int[] inputArray(){
        int n=scn.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;++i){
            A[i]=scn.nextInt();
        }
        return A;
    }
    public static void displayArray(int[] Arr){
        for(int val:Arr){
           System.out.println(val);
        }
    }
    public static int[] sumOfArray(int[] A,int[] B){
        int n=A.length, m=B.length;
        int size=(n>=m)?n:m;
        int small=(n>=m)?m:n;
        int[] ans=new int[size];
        
        // int size;
        int carry=0,sum=0,i=1;
        for(;i<=small;++i){
            sum=A[n-i]+B[m-i]+carry;
            carry=sum/10;
            ans[size-i]=sum%10;
        }
        for(;i<=size;++i){
            if(i<n){
                sum=A[n-i]+carry;
                carry=sum/10;
                ans[size-i]=sum%10;
            }else{
                sum=B[m-i]+carry;
                carry=sum/10;
                ans[size-i]=sum%10;
            }
        }
        if(carry!=0){
            int[] res=new int[size+1];
            res[0]=1;
            for(int idx=0;idx<size;++idx){
                res[idx+1]=ans[idx];
            }
            ans=res;
        }
        return ans;
    }
}
