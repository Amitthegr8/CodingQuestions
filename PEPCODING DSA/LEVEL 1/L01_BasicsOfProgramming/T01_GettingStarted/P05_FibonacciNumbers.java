package T01_GettingStarted;

import java.util.*;

public class P05_FibonacciNumbers {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many fibonacci numbers you want: ");
        int n = scn.nextInt();
        int a = 0, b = 1;
        // int temp=0;
        for (int i = 1; i <= n; ++i) {
            System.out.println(a);
            b = a + b;
            a = b-a;
        }
    }
}