package T01_GettingStarted;

import java.util.Scanner;

public class P03_IsPrime {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        
        // find if num is prime
        System.out.print("Check if num is Prime;\nInput num: ");
        int  n=scn.nextInt();
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
