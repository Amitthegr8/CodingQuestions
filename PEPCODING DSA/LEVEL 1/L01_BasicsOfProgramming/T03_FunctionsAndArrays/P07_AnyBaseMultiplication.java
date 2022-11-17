package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P07_AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int mul = getmul(b, n1, n2);
        System.out.println(mul);
        scn.close();
     }
    
     public static int getmul(int b, int n1, int n2){
         // write ur code here
         int p=getValueIndecimal(n1, b);
         int q=getValueIndecimal(n2, b);
         int ans=getValueInBase(q*p, b);
         return ans;
     }
     public static int getValueIndecimal(int n, int b){
        // write your code here
        int dig, mul=1, ans=0;
        while(n>0){
            dig=n%10;
            ans+=dig*mul;
            mul*=b;
            n/=10;
        }
        return ans;
     }
     public static int getValueInBase(int n, int b){
        // write code here
        int mul=1, ans=0, dig;
        while(n>0){
            dig=n%b;
            n/=b;
            ans+=dig*mul;
            mul*=10;
        }
        return ans;
    }

    // taught in class
    // breaking down into functions
    public static int anyBaseMultiplyNew(int n,int m,int base){
        int ans=0,npower=1;
        while(n!=0){
            int ndigit=n%10;
            int res=multiplyDigitWithNumber(ndigit,npower,m,base);
            ans=AnyBaseAddition(ans, res, base);
            n/=10;
            npower*=10;
        }
        return ans;
    }
    private static int multiplyDigitWithNumber(int ndigit, int npower, int m, int base) {
        int carry=0,mdigit,mpower=1;
        int res,ans=0;
        while(m!=0||carry!=0){
            mdigit=m%10;
            res=mdigit*ndigit+carry;
            carry=res/base;
            ans+=(res%base)*npower*mpower;
            // update
            mpower*=10;
            m/=10;
        }
        return ans;
    }
    public static int AnyBaseAddition(int n1,int n2,int base){
        int ans=0,carry=0,mul=1;
        while(n1>0 || n2>0 || carry!=0){
            // work
            int num=(n1%10)+(n2%10)+carry;
            int digit=num%base;
            ans=ans+digit*mul;
            // update
            carry=num/base;
            n1/=10; n2/=10;
            mul*=10;
        }
        return ans;
    }
}

