package class_005;

import java.util.Scanner;

public class ExtraPatterns {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        extra04(n);
        System.out.println("\n");
        extra05(n);
        System.out.println("\n");
        extra05_2(n);
        System.out.println("\n");
        Pattern13from0(n);
    }
    public static void extra04(int n){
        int nsp=n/2,nst=1,num=1;
        for(int row=1;row<=n;++row){
            for(int csp=1;csp<=nsp;++csp){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;++cst){
                System.out.print(num+"\t");
            }
            if(row<=n/2){
                ++num; --nsp; nst+=2;
            }else{
                --num; ++nsp; nst-=2;
            }
            System.out.println();
        }
    }
    public static void extra05(int n){
        int nsp=n/2,nst=1,num=1;
        for(int row=1;row<=n;++row){
            if(row<=n/2+1){
                num=row;
            } else {
                num=n+1-row;
            }
            for(int csp=1;csp<=nsp;++csp){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;++cst){
                System.out.print(num+"\t");
                if(cst<=nst/2) --num;
                else ++num;
            }
            if(row<=n/2){
               --nsp; nst+=2;
            }else{
                ++nsp; nst-=2;
            }
            System.out.println();
        }
    }

    public static void extra05_2(int n){
        int nsp=n/2,nst=1,num,digit=1;
        for(int row=1;row<=n;++row){
            num=digit;
            for(int csp=1;csp<=nsp;++csp){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;++cst){
                System.out.print(num+"\t");
                if(cst<=nst/2) --num;
                else ++num;
            }
            if(row<=n/2){
               ++digit; --nsp; nst+=2;
            }else{
               --digit; ++nsp; nst-=2;
            }
            System.out.println();
        }
    }

    public static void Pattern13from0(int rows) {
        // since (n)C(r+1) = (n)C(r)* ((n-r)/(r+1))
        int num;
        for (int n = 0; n < rows; ++n) {
            num = 1;
            for (int r = 0; r <= n; ++r) {
                System.out.print(num + "\t");
                num = (num * (n - r)) / (r+1);
            }
            // new line
            System.out.println();
        }
    }
}
