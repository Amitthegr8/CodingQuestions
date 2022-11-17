package class_006;

import java.util.Scanner;

public class functions {
    public static Scanner scn = new Scanner(System.in);
    public static void intro(int i) {
        System.out.println("============ PATTERN " + i + " ============");
    }

    public static void outro() {
        System.out.println("============== END ================\n");
    }

    public static void main(String[] args) {
        int num = scn.nextInt();
        // int num = 7;
        int count = 0;
        intro(count++);
        Pattern14(num);
        outro();

        intro(count++);
        Pattern15(num);
        outro();

        intro(count);
        Pattern16_stars(num);
        outro();

        intro(count++);
        Pattern16(num);
        outro();

        intro(count);
        Pattern17_sir(num);
        outro();

        intro(count++);
        Pattern17(num);
        outro();

        intro(count);
        Pattern18_Full(num);
        outro();

        intro(count++);
        Pattern18(num);
        outro();

        intro(count++);
        Pattern19(num);
        outro();

        intro(count);
        Pattern20(num);
        outro();

        intro(count++);
        Pattern20_Sir(num);
        outro();

    }
    public static void Pattern13(int n) {
        // since (n)C(r+1) = (n)C(r)* ((n-r)/(r+1))
        int nst = 1, num;
        for (int row = 1; row <= n; ++row) {
            num = 1;
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print(num + "\t");
                num = (num * (row - cst)) / (cst);
            }
            // new line
            System.out.println();
            // updation
            nst++;
        }
    }

    public static void Pattern14(int table) {
        for (int num = 1; num <= 10; ++num) {
            System.out.println(table + " * " + num + " = " + (table * num));
        }
    }

    public static void Pattern15(int n) {
        if (n % 2 == 0)
            ++n; // even to odd

        int nsp = n / 2, nst = 1, num, start = 1;
        for (int row = 1; row <= n; ++row) {
            num = start;
            // print
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print(num + "\t");
                if (cst <= nst / 2) {
                    ++num;
                } else
                    --num;
            }
            // updaate
            if (row <= n / 2) {
                nsp--;
                nst += 2;
                ++start;
            } else {
                ++nsp;
                nst -= 2;
                --start;
            }
            // new line
            System.out.println();
        }
    }

    public static void Pattern16_stars(int n) {
        int nsp = 2 * n - 3, nst = 1;
        for (int row = 1; row <= n; ++row) {
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            if (row == n)
                --nst;
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            // new line
            System.out.println();
            // updation
            nsp -= 2;
            nst++;
        }
    }

    public static void Pattern16(int n) {
        int nsp = 2 * n - 3, nst = 1, num;
        for (int row = 1; row <= n; ++row) {
            num = 1;
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print(num + "\t");
                ++num;
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            if (row == n) {
                --nst;
                --num;
            }
            for (int cst = 1; cst <= nst; ++cst) {
                --num;
                System.out.print(num + "\t");
            }
            // new line
            System.out.println();
            // updation
            nsp -= 2;
            nst++;
        }
    }

    public static void Pattern17(int n) {
        int nsp = n / 2, nst = 1;
        for (int row = 1; row <= n; ++row) {
            if (row == n / 2 + 1) {
                nsp = 0;
                nst = n;
            } else {
                nsp = n / 2;
                nst = (row <= n / 2) ? row : n + 1 - row;
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            // new line
            System.out.println();
            // updation
        }
    }

    public static void Pattern17_sir(int n) {
        int nsp = n / 2, nst = 1;
        for (int row = 1; row <= n; ++row) {
            for (int csp = 1; csp <= nsp; ++csp) {
                String s = "\t";
                if (row == n / 2 + 1)
                    s = "*" + s;
                System.out.print(s);
            }
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            // new line
            System.out.println();
            // update
            if (row <= n / 2)
                ++nst;
            else
                --nst;
        }
    }

    public static void Pattern18_Full(int n) {
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
            // update
            if (row <= n / 2) {
                nst -= 2;
                ++nsp;
            } else {
                nst += 2;
                --nsp;
            }
        }
    }

    public static void Pattern18(int n) {
        int nsp = 0, nst = n;
        for (int row = 1; row <= n; ++row) {
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            // System.out.print("*\t");
            // for(int cst=2;cst<nst;++cst){
            // if(row>1&&row<=n/2){
            // System.out.print("\t");
            // } else{
            // System.out.print("*\t");
            // }
            // } if(nst>1) System.out.print("*\t");
            // I can also write
            for (int cst = 1; cst <= nst; ++cst) {
                if (row > 1 && row <= n / 2 && cst > 1 && cst < nst) { // changes from (1,n/2] and
                    System.out.print("\t"); // not for col==1 or nst(last star)
                } else {
                    System.out.print("*\t");
                }
            }
            // new line
            System.out.println();
            // update
            if (row <= n / 2) {
                nst -= 2;
                ++nsp;
            } else {
                nst += 2;
                --nsp;
            }
        }
    }

    public static void Pattern19(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i == n / 2 + 1 || j == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    if (i == 1 && j <= n / 2 || i == n && j > n / 2 || j == 1 && i > n / 2 || j == n && i <= n / 2) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void Pattern21(int n) {
        int nst = 1, nsp = n - 2;
        for (int row = 1; row <= n; ++row) {
            for (int cst = 1; cst <= nst; ++cst) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                if (row == n / 2 + 1 && cst == 1)
                    ++cst;
                System.out.print("*\t");
            }
            System.out.println();
            // update
            if (row <= n / 2) {
                ++nst;
                nsp -= 2;
            } else {
                --nst;
                nsp += 2;
            }
        }
    }

    public static void Pattern22(int n) {
        int nst = 1, nsp = n - 2;
        for (int row = 1; row <= n; ++row) {
            for (int cst = 1; cst <= nst; ++cst) {
                if (cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else
                    System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                if (row == n / 2 + 1 && cst == 1)
                    ++cst;
                if (cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else
                    System.out.print("*\t");
                System.out.print("*\t");
            }
            System.out.println();
            // update
            if (row <= n / 2) {
                ++nst;
                nsp -= 2;
            } else {
                --nst;
                nsp += 2;
            }
        }
    }

    public static void Pattern23(int n) {
        int nst = 1, nsp = n - 2;
        for (int row = 1; row <= n; ++row) {
            for (int cst = 1; cst <= nst; ++cst) {
                if (cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else
                    System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                if (row == n / 2 + 1 && cst == 1)
                    ++cst;
                if (cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else
                    System.out.print("*\t");
            }
            System.out.println();
            // update
            if (row <= n / 2) {
                ++nst;
                nsp -= 2;
            } else {
                --nst;
                nsp += 2;
            }
        }
    }

    public static void Pattern20(int n) {
        int nst = 1, nsp = n - 2;
        if(n==1) {
            System.out.println("*");
            return;
        }
        for (int row = 1; row <= n; ++row) {
            for (int cst = 1; cst <= nst; ++cst) {
                if (cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else {
                    if (row <= n / 2 && cst == nst && nst != 1)
                        System.out.print("\t");
                    else {
                        System.out.print("*\t");
                    }
                }
            }
            for (int csp = 1; csp <= nsp; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                if (row == n / 2 + 1 && cst == 1)
                    ++cst;
                if (cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else {
                    if (row <= n / 2 && cst == 1 && nst != 1)
                        System.out.print("\t");
                    else {
                        System.out.print("*\t");
                    }
                }
            }
            System.out.println();
            // update
            if (row <= n / 2) {
                ++nst;
                nsp -= 2;
            } else {
                --nst;
                nsp += 2;
            }
        }
    }

    public static void Pattern20_Sir(int n){
        for(int i=1;i<=n;++i){
            for(int j=1;j<=n;++j){
                if(j==1 || j==n){
                    System.out.print("*\t");
                }
                else if(i>n/2 && (i==j || i+j==n+1)) { // half diagonals
                    System.out.print("*\t");
                }
                else System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void Pattern24(int n) {
        int nsp1 = n / 2, nst = 1;
        for (int row = 1; row <= n; ++row) {
            // print
            for (int csp = 1; csp <= nsp1; ++csp) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; ++cst) {
                if(cst==1 || cst==nst) 
                    System.out.print("*\t");
                else if(cst==3||cst==nst-2|| cst==5||cst==nst-4)  
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            // update
            if (row <= n / 2) {
                --nsp1; nst += 2;
            } else {
                ++nsp1; nst -= 2;
            }
            // new line
            System.out.println();
        }
    }
}
