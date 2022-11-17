package T03_FunctionsAndArrays;

import java.util.Scanner;

public class P09_FindElement {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;++i){
            a[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int index=findElement(a,d);
        System.out.println(index);
    }
    public static int findElement(int[] a,int d){
        for(int i=0;i<a.length;++i){
            if(a[i]==d)
                return i;
        }
        return -1;
    }
}
