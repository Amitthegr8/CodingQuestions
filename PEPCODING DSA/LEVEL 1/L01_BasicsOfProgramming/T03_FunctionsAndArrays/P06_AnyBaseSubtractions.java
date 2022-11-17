package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P06_AnyBaseSubtractions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getdiff(b, n1, n2);
        System.out.println(d);
        scn.close();
     }
    
     public static int getdiff(int b, int n1, int n2){
         // write ur code here
         int p=getValueIndecimal(n1, b);
         int q=getValueIndecimal(n2, b);
         int ans=getValueInBase(q-p, b);
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
}
