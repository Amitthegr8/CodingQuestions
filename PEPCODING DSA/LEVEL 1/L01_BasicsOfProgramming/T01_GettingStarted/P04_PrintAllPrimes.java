package T01_GettingStarted;

import java.util.Scanner;

public class P04_PrintAllPrimes {
    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        System.out.print("Low: ");
        int low=scn.nextInt();
        System.out.print("High: ");
        int high=scn.nextInt();
        PrimeRange(low,high);
        scn.close();
    }
    public static void PrimeRange(int low, int high){
        if(low<2) low=2;
        for(int i=low;i<=high;++i){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; ++i){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
