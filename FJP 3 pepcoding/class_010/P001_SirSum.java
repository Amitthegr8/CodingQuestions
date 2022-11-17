package class_010;

public class P001_SirSum {
    public static void main(String[] args){
        int[] a={4,6,7,1};
        int[] b={1,2,3,4};
        int[] ans=sum(a,b);
        for(int val:ans){
            System.out.println(val);
        }
        
    }
    public static int[] sum(int[] a,int[] b){
        int size=0;
        if(a.length>=b.length){
            size=a.length;
        }else{
            size=b.length;
        }
        int[] ans=new int[size];
        int carry=0,sum;
        int i=a.length-1,j=b.length-1;
        while(i>=0||j>=0){
            sum=0;
            if(i>=0){
                sum+=a[i];
            }
            if(j>=0){
                sum+=b[j];
            }
            sum+=carry;
            ans[size-1]=sum%10;
            carry=sum/10;
            /// update
            --i;--j;--size;
        }
        if(carry>0){
            System.out.println(carry);
        }
        return ans;
    }
}
