package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P04_AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
       int  destBase= scn.nextInt();
       int ans=BaseConversion(n, sourceBase, destBase);
       System.out.println(ans);
       scn.close();
    }
    public static int BaseConversion(int n, int sb, int db){
        int souceDecimal=getValueIndecimal(n, sb);
        int ans=getValueInBase(souceDecimal, db);
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
}
