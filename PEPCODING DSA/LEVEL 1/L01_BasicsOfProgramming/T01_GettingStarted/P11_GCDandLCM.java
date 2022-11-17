package T01_GettingStarted;

import java.util.Scanner;

public class P11_GCDandLCM {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter 2 Numbers: ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int gcd;

        // gcd till smaller number
        gcd=GCD(a,b);
        System.out.println(gcd);

        // gcd using long division
        gcd=GCDLongDivision(a,b);
        
        System.out.println(gcd);
        System.out.println((a*b)/gcd);
    }
    public static int GCD(int a,int b){
        int small=a,large=b,gcd=1;
        if(a>b){
            small=b;
            large=a;
        }
        for(int i=2;i<=small;++i){
            while(small%i==0&&large%i==0){
                gcd*=i;
                small/=i;
                large/=i;
            }
        }
        return gcd;
    }
    public static int GCDLongDivision(int a,int b){
        int D,d,r=1;
        if(a>=b) {
            D=a; d=b;
        }else{
            D=b; d=a;
        }
        while(r!=0){
            r=D%d;
            D=d;
            d=r;
        }
        return D;
    }
}
