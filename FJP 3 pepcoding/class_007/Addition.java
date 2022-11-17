package class_007;

import java.util.Scanner;

public class Addition {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {   
        // int n1=scn.nextInt();
        // int n2=scn.nextInt();
        // int ans=DecimalAddition(n1, n2);
        // System.out.println(ans);

        // n1=scn.nextInt();
        // n2=scn.nextInt();
        // ans=BinaryAddition(n1, n2);
        // System.out.println(ans);

        // n1=scn.nextInt();
        // n2=scn.nextInt();
        // int base=scn.nextInt();
        // ans=AnyBaseAddition(n1, n2, base);
        // System.out.println(ans);

        // SUBTRACTION
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int ans=DecimalSubtraction(n1, n2);
        System.out.println(ans);

        // int n1=scn.nextInt();
        // int n2=scn.nextInt();
        // int ans=BinarySubtraction(n1, n2);
        // System.out.println(ans);

        // int n1=scn.nextInt();
        // int n2=scn.nextInt();
        // int ans=AnyBaseSubtraction(n1, n2);
        // System.out.println(ans);
    }

    public static int DecimalSubtraction(int n1,int n2){
        int ans=0,borrow=0,pow=1;
        while(n1>0 || n2>0 ){
            // work
            int num=(n2%10)-(n1%10)-borrow;
            if(num<0){
                borrow=1; num+=10;
            }else borrow=0;
            int digit=num;
            ans=ans+digit*pow;
            // update
            n1/=10; n2/=10;
            pow*=10;
        }
        return ans;
    }
    public static int BinarySubtraction(int n1,int n2){
        int ans=0,borrow=0,pow=1;
        while(n1>0 || n2>0 ){
            // get last digits
            int num=(n2%10)-(n1%10)-borrow;
            // borrow=0;
            if(num<0){
                borrow=1; num+=2;
            }else borrow=0;
            int digit=num;
            ans=ans+digit*pow;
            // update
            n1/=10; n2/=10;
            pow*=10;
        }
        return ans;
    }
    public static int AnyBaseSubtraction(int n1,int n2,int base){
        int ans=0,borrow=0,pow=1;
        while(n1>0 || n2>0 ){
            // work
            int num=(n2%10)-(n1%10)-borrow;
            // borrow=0;
            if(num<0){
                borrow=1; num+=base;
            }else borrow=0;
            int digit=num;
            ans=ans+digit*pow;
            // update
            n1/=10; n2/=10;
            pow*=10;
        }
        return ans;
    }

    public static int DecimalAddition(int n1,int n2){
        int ans=0,carry=0,mul=1;
        while(n1>0 || n2>0 || carry!=0){
            // work
            int num=(n1%10)+(n2%10)+carry;
            int digit=num%10;
            ans=ans+digit*mul;
            // update
            carry=num/10;
            n1/=10; n2/=10;
            mul*=10;
        }
        return ans;
    }
    public static int BinaryAddition(int n1,int n2){
        int ans=0,carry=0,mul=1;
        while(n1>0 || n2>0 || carry!=0){
            // work
            int num=(n1%10)+(n2%10)+carry;
            int digit=num%2;
            ans=ans+digit*mul;
            // update
            carry=num/2;
            n1/=10; n2/=10;
            mul*=10;
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
