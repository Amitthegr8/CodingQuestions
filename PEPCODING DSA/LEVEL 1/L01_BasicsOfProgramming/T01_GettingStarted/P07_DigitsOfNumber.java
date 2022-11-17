package T01_GettingStarted;

import java.util.Scanner;

public class P07_DigitsOfNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number whose digits are to be found: ");
        int n = scn.nextInt();
        digitsOfNum(n);
        scn.close();
    }

    public static void digitsOfNum(int num) {
        int mul = 1;
        // reversing and printing lead to loss of trailing zeroes
        int n = countDigits(num);
        while (n-- > 1) {
            mul *= 10;
        }
        while (mul > 0) {
            System.out.println(num / mul);
            num = num % mul;
            mul /= 10;
        }

    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            ++count;
            num /= 10;
        }
        return count;
    }
}
