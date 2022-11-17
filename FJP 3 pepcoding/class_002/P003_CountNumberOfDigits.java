package class_002;

import java.util.Scanner;

public class P003_CountNumberOfDigits {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int num=scn.nextInt();
        int count=countDigits(num);
        System.out.println("num of digits: "+count);
        reverseDigitsOfNum(num);
        int ans=reverseNum(num);
        System.out.println("Reverse of "+num+" = "+ans);
        System.out.println("Digits of "+num+" in correct order: \n");
        digitsOfNum(num);
    }
    public static int countDigits(int num){
        int count=0;
        while(num>0){
            ++count;
            num/=10;
        }
        return count;
    }
    public static void reverseDigitsOfNum(int num){
        int digit;
        while(num>0){
            digit=num%10;
            System.out.println(digit);
            num/=10;
        }
    }
    public static int reverseNum(int num){
        int digit,ans=0;
        while(num>0){
            digit=num%10;
            ans=ans*10+digit;
            num/=10;
        }
        return ans;
    }
    public static void digitsOfNum(int num){
        int mul=1;
        // reversing and printing lead to loss of trailing zeroes
        int dig=countDigits(num);
        while(dig-->1){
            mul*=10;
        }
        while(mul>0){
            System.out.println(num/mul);
            num=num%mul;
            mul/=10;
        }

    }
}