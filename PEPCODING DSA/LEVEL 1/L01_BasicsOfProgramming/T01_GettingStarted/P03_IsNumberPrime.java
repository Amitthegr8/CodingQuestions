package T01_GettingStarted;

import java.util.Scanner;

public class P03_IsNumberPrime {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter num of TEST CASES: ");
        int t=scn.nextInt();
        while(t-->0){
            if(IsPrime(scn.nextInt())){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
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
