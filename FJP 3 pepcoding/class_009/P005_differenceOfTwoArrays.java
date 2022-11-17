package class_009;
import java.util.Scanner;
public class P005_differenceOfTwoArrays {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
         // first array input
         int[] arr1=takeInputArray();

         // second array input
         int[] arr2=takeInputArray();
         
         // find difference
         int[] ans=arrayDifference(arr1, arr2);

         int count=0;
         while(ans[count]==0){
            ++count;
         }
         for(;count<ans.length;++count){
            System.out.println(ans[count]);
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
    public static int[] arrayDifference(int[] a,int[] b){
        int[] A,B; // A is greater number
        A=a;
        B=b;
        if(b.length>a.length ){
            A=b; B=a;
        }
        else if(b.length==a.length){
            int i=0;
            while(b[i]-a[i]==0){
                ++i;
            } // check if a is smaller
            if(b[i]>a[i]){
                A=b; B=a;
            }
        }
        int[] ans=new int[A.length];
        int borrow=0,num;
        for(int i=0;i<B.length;++i){ // only till lesser array exhausted
            num=A[A.length-1-i]-B[B.length-1-i]-borrow;
            if(num<0){
                borrow=1; // for next step
                ans[A.length-1-i]=num+10;
            } else {
                borrow=0;
                ans[A.length-1-i]=num;
            }
        }
        // B array exhausted now copy remaining into A
        for(int i=B.length;i<A.length;++i){
            ans[A.length-1-i]=A[A.length-1-i]-borrow;
            borrow=0;
        }
        return ans;
    } 
}
