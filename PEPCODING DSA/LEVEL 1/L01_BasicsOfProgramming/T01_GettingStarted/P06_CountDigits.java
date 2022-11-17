package T01_GettingStarted;

import java.util.*;

public class P06_CountDigits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = scn.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
        scn.close();
    }
}
