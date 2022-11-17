package class_001;
import java.util.Scanner;
public class GCD_LCM_Testing {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int a=scn.nextInt();
        int b=scn.nextInt();
        int gcd=GCD(a,b);
        System.out.println(gcd);
        System.out.println((a*b)/gcd);
    }
    public static int GCD(int a,int b){
        int small=a,large=b,gcd=1;
        if(a>b){
            small=b;
            large=a;
        }
        // int loop=large; doesnt work since commmon factors may be out of reach of sqrt(both)
        for(int i=2;i<=small;++i){
            while(small%i==0&&large%i==0){
                gcd*=i;
                small/=i;
                large/=i;
            }
        }
        return gcd;
    }
}
