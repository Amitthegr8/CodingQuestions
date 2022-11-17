package class_001;

import java.util.Scanner;

public class P006_Loops {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;

        // to print number from 1 to 10
        for (num = 1; num <= 10; ++num) {
            System.out.println(num);
        }

        // to print number from 10 to 1
        for (num = 10; num >= 1; --num) {
            System.out.println(num);
        }

        // to print table
        int n=scn.nextInt();
        for (num = 1; num <= 10; ++num) {
            System.out.println(n+"  X  "+num+"  =  "+(n*num));
        }

        // find if num is prime
        System.out.println("Check if num is Prime;\n Input num: ");
        n=scn.nextInt();
        boolean ans=IsPrime(n);
        System.out.println(ans);
    }

    public static boolean IsPrime(int num){
        boolean isPrime=true;
        for(int i=2;i*i<=num;++i){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
