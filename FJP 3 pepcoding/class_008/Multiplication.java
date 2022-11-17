package class_008;
import java.util.*;

public class Multiplication{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int dans=decimalMultiply(n, m);
        // int bans=binaryMultiply(n, m);
        // int base =scn.nextInt();
        // // int aans=anyBaseMultiply(n, m, base);
        // int aans=anyBaseMultiplyNew(n, m, base);
        System.out.println(dans);
    }
    public static int decimalMultiply(int n,int m){
        int pow=1,ans=0;
        while(m!=0){
            int num=n,dig=m%10;
            int innerPower=1,carry=0;
            while(num!=0||carry!=0){
                int res=(num%10)*dig+carry;
                carry=res/10;
                ans+=(res%10)*pow*innerPower;
                num/=10;
                innerPower*=10;
            }
            m/=10;
            pow*=10;
        }
        return ans;
    }
    public static int binaryMultiply(int n,int m){
        int pow=1,ans=0;
        while(m!=0){
            int num=n,dig=m%10,carry=0,res;
            int innerPower=1;
            while(num!=0){
                res=(num%10)*dig+carry;
                ans+=(res%2)*innerPower*pow;
                carry=res/2;
                num/=10;
                innerPower*=2;
            }
            m/=10;
            pow*=2;
        }
        return ans;
    }
    public static int anyBaseMultiply(int n,int m,int base){
        int mPower=1,finalAns=0;
        while(m!=0){
            int numN=n,mDig=m%10,carry=0,res,ans=0;
            int nPower=1;
            while(numN!=0||carry!=0){
                res=(numN%10)*mDig+carry;
                ans+=(res%base)*nPower*mPower;
                carry=res/base;
                numN/=10;
                nPower*=10;
            }
            finalAns=AnyBaseAddition(finalAns,ans , base);
            m/=10;
            mPower*=10;
        }
        return finalAns;
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
}