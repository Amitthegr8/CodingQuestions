package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P01_DigitFrequency {
    public static Scanner scn=new Scanner(System.in);
//     1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.
    public static void main(String[] args){
        int n=scn.nextInt();
        int d=scn.nextInt();
        int f=frequency(n, d);
        System.out.println(f);
    }
    public static int frequency(int n, int d){
        int f=0;
        while(n>0){
            if(n%10==d) {
                ++f;
            }
            n/=10;
        }
        return f;
    }
}
