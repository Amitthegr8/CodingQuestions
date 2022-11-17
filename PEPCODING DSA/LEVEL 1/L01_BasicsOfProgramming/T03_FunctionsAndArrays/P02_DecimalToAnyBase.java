package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P02_DecimalToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
      scn.close();
      
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
