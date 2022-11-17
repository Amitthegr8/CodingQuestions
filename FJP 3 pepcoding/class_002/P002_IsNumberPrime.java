package class_002;

import java.util.Scanner;

public class P002_IsNumberPrime {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
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
