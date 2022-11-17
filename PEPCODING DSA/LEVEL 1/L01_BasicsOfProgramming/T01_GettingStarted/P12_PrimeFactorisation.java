package T01_GettingStarted;

import java.util.Scanner;

public class P12_PrimeFactorisation {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int num = scn.nextInt();
        // primeFactors(num);
        primeFactorsbySir(num);
    }

    public static void primeFactors(int num) {
        for (int i = 2; i * i <= num; ++i) {
            if (IsPrime(i)) {
                while (num % i == 0) {
                    System.out.print(i + " ");
                    num /= i;
                }
            }
        }
        if (num > 1) {
            System.out.print(num + " ");
        }
    }

    public static boolean IsPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // sir's solution
    public static void primeFactorsbySir(int num) {
        for (int i = 2; i * i <= num; ++i) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 1) {
            System.out.print(num + " ");
        }
    }
}