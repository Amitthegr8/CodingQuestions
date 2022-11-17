package class_007;

import java.util.Scanner;

public class Functions {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Decimal to AnyBase :");
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getDecimalInBaseValue(n, b);
        System.out.println(dn);

        System.out.println("AnyBase to Decimal :");
        n = scn.nextInt();
        b = scn.nextInt();
        int bn = getBaseValueIndecimal(n, b);
        System.out.println(bn);

        System.out.println("AnyBase to AnyBase :");
        n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int val = getAnyBaseValueInAnyBase(n, b1, b2);
        System.out.println(val);

        System.out.println("AnyBase Addition:");
        b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int d = getSum(b, n1, n2);
        System.out.println(d);

        System.out.println("AnyBase Subtraction:");
        b = scn.nextInt();
        n1 = scn.nextInt();
        n2 = scn.nextInt();
        d = getDiff(b, n1, n2);
        System.out.println(d);

        System.out.println("AnyBase Multiplication:");
        b = scn.nextInt();
        n1 = scn.nextInt();
        n2 = scn.nextInt();

        d = getMult(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int p = getBaseValueIndecimal(n1, b);
        int q = getBaseValueIndecimal(n2, b);
        int ans = getDecimalInBaseValue(q + p, b);
        return ans;
    }
    public static int getDiff(int b, int n1, int n2) {
        int p = getBaseValueIndecimal(n1, b);
        int q = getBaseValueIndecimal(n2, b);
        int ans = getDecimalInBaseValue(q - p, b);
        return ans;
    }
    public static int getMult(int b, int n1, int n2) {
        int p = getBaseValueIndecimal(n1, b);
        int q = getBaseValueIndecimal(n2, b);
        int ans = getDecimalInBaseValue(q * p, b);
        return ans;
    }
    
    public static int getDecimalInBaseValue(int n, int b) {
        // write code here
        int mul = 1, ans = 0, dig;
        while (n > 0) {
            dig = n % b;
            n /= b;
            ans += dig * mul;
            mul *= 10;
        }
        return ans;
    }

    public static int getBaseValueIndecimal(int n, int b) {
        // write your code here
        int dig, mul = 1, ans = 0;
        while (n > 0) {
            dig = n % 10;
            ans += dig * mul;
            mul *= b;
            n /= 10;
        }
        return ans;
    }

    public static int getAnyBaseValueInAnyBase(int n, int sb, int db) {
        int souceDecimal = getBaseValueIndecimal(n, sb);
        int ans = getDecimalInBaseValue(souceDecimal, db);
        return ans;
    }
}