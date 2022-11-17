package T03_FunctionsAndArrays;

import java.util.*;

public class P08_SpanOfArray{

public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] A=new int[n];
    for(int i=0;i<n;++i){
        A[i]=scn.nextInt();
    }
    int max=A[0],min=A[0];
    for(int i=0;i<n;++i){
        if(A[i]>max) max=A[i];
        if(A[i]<min) min=A[i];
    }
    scn.close();

    System.out.println(max-min);
 }
}