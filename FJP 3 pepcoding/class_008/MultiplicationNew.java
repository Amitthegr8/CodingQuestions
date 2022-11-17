package class_008;
import java.util.*;

public class MultiplicationNew{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int base=scn.nextInt();
        int ans=multiply(m,n,base);
        System.out.println(ans);
    }
    public static int multiply(int m,int n,int base){
        int ans=0,power=1,res;
        while(n>0){
            res=multiplyDigitWithNumber(m, n%10, base);
            ans=AnyBaseAddition(ans, res*power, base);
            n/=10;
            power*=10;
        }
        return ans;
    }
    public static int multiplyDigitWithNumber(int n,int digit,int base){
        int ans=0,power=1,carry=0;
        while(n>0){
            int num=(n%10)*digit+carry;
            ans=ans+(num%base)*power;
            // update
            carry=num/base;
            power*=10;
            n/=10;
        }
        ans+=carry*power;
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