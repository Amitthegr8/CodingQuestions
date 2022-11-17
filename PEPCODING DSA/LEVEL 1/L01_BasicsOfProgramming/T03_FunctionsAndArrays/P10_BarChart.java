package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P10_BarChart {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){  
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;++i){
            a[i]=scn.nextInt();
        }
        int max=0;
        for(int i=1;i<n;++i){
            if(a[max]<a[i]){
                max=i;
            }
        }
        System.out.println();
        printBarChart(a, n, max);
    }
    public static void printBarChart(int[] a,int n, int max){
        int count=a[max]; 
        for(int height=1; height<=a[max] ;++height){
            for(int building=0;building<a.length;++building){
                if(count<=a[building]){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            --count;
            System.out.println();
        }
    }
}
