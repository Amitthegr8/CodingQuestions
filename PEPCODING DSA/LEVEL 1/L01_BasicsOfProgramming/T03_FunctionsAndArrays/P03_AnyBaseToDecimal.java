package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P03_AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
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
    
}
