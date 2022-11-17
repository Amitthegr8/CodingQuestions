package T01_GettingStarted;

import java.util.*;

public class P08_ReverseOfNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
        scn.close();
    }
}
