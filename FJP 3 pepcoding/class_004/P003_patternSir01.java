package class_004;

import java.util.Scanner;

public class P003_patternSir01 {
    public static Scanner scn = new Scanner(System.in);

    public static void intro(int i) {
        System.out.println("========= EXTRA PATTERN " + i + " =========");
    }

    public static void outro() {
        System.out.println("============== END ================\n");
    }

    public static void main(String[] args) {
        int num = scn.nextInt();
        // int num = 7;
        int count = 0;

        intro(count++);
        Pattern00(num);
        outro();

        intro(count++);
        ExtraPattern02(num);
        outro();

        intro(count++);
        ExtraPattern03(num);
        outro();

        // Using matrix method for patterns like pattern 7,8
        System.out.println("Using matrix method for patterns like pattern 7,8");
        pattern7_matrix(num);
        System.out.println("Pattern 8");
        pattern8_matrix(num);
      
    }
    public static void pattern7_matrix(int n){
        for(int row=1;row<=n;++row){
            for(int col=1;col<row;++col){
                System.out.print("\t");
            }
            System.out.println("*\t");
        }
        // or we could do
        for(int row=1;row<=n;++row){
            for(int col=1;col<=n;++col){
                if(row==col) {
                    System.out.print("*\t");
                }
                else System.out.print("\t");
            }
            System.out.println();
        }
    }
    public static void pattern8_matrix(int n){
        for(int row=1;row<=n;++row){
            for(int col=1;col<=n-row;++col){
                System.out.print("\t");
            }
            System.out.println("*\t");
        } // or we could do
        for(int row=1;row<=n;++row){
            for(int col=1;col<=n;++col){
                if(row+col==n+1) {
                    System.out.print("*\t");
                }
                else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void ExtraPattern02(int num){
        int nsp=num-1,nst=1;
        for(int row=1; row<=num; ++row){
            for(int csp=1; csp<=nsp;++csp){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;++cst){
                System.out.print("*\t");
            }
            // update
            --nsp;
            nst+=2;
            // new line
            System.out.println();
        }
    }
    public static void ExtraPattern03(int num){
        int nsp=0, nst=2*num-1;
        for(int row=1; row<=num; ++row){
            for(int csp=1; csp<=nsp;++csp){
                System.out.print("\t");
            }
            for(int cst=1;cst<=nst;++cst){
                System.out.print("*\t");
            }
            // update
            ++nsp;
            nst-=2;
            // new line
            System.out.println();
        }
    }

    public static void Pattern00(int num) {
        int nsp = num, nst = num;
        for (int i = 1; i <= num; ++i) {
            // print
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            // updation
            nsp += 0;
            nst += 0;
            // new line
            System.out.println();
        }
    }

    public static void Pattern01(int n) {
        int nsp = 0, nst = 1;
        for (int row = 1; row <= n; ++row) {
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            // new line
            System.out.println();
            // updation
            nsp -= 0;
            nst++;
        }
    }

    public static void Pattern02(int n) {
        int nsp = 0, nst = n;
        for (int row = 1; row <= n; ++row) {
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            // new line
            System.out.println();
            // updation
            nsp -= 0;
            nst--;
        }
    }

    public static void Pattern03(int n) {
        int nsp = n - 1, nst = 1;
        for (int row = 1; row <= n; ++row) {
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }

    public static void Pattern04(int n) {
        int nsp = 0, nst = n;
        for (int row = 1; row <= n; ++row) {
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            System.out.println();
            nsp++;
            nst--;
        }
    }

    public static void Pattern05(int n) {
        int nsp = n/2, nst = 1;
        for (int row = 1; row <= n; ++row) {
            // print
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
             // updaate
            if(row<=n/2) {
                nsp--;
                nst+=2;
            }else{
                ++nsp;
                nst-=2;
            }
            // new line
            System.out.println();
        }
    }

    public static void Pattern06(int n) {
        int nsp =1, nst = n/2+1;
        for (int row = 1; row <= n; ++row) {
            // print
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
             // updaate
            if(row<=n/2) {
                nsp+=2;
                nst--;
            }else{
                nsp-=2;
                nst++;
            }
            // new line
            System.out.println();
        }
    }

    public static void Pattern07(int n) {
        int nsp = 0, nst = 1;
        for (int row = 1; row <= n; ++row) {
            // print
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
             // updaate
            ++nsp;
            // new line
            System.out.println();
        }
    }

    public static void Pattern08(int n) {
        int nsp = n-1, nst = 1;
        for (int row = 1; row <= n; ++row) {
            // print
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
             // updaate
            --nsp;
            // new line
            System.out.println();
        }
    }
}