package class_009;

import java.util.*;
public class P001_SpanOfArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int[n];
        takeInput(arr);
        System.out.println(span(arr));
    }
    public static void takeInput(int[] arr){
        for(int i=0;i<arr.length;++i){
            arr[i]=scn.nextInt(); // setter
        }
    }
    public static int span(int[] arr){
        // int max=arr[0],min=arr[0];
        // or we take infinity and neg infinity
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;++i){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return max-min;
    }
}