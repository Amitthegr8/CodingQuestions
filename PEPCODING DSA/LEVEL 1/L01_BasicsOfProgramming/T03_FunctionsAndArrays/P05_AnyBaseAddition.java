package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P05_AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getSum(b, n1, n2);
        System.out.println(d);
        scn.close();
     }
    
     public static int getSum(int b, int n1, int n2){
         // write ur code here
         int p=getValueIndecimal(n1, b);
         int q=getValueIndecimal(n2, b);
         int ans=getValueInBase(p+q, b);
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
