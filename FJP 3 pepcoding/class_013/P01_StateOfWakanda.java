package class_013;

import java.util.Scanner;

public class P01_StateOfWakanda{

    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] monuments= takeInput(n, m);
        StateOfWakanda(monuments, n, m);
    }
    public static void StateOfWakanda(int[][] A, int n, int m){
        for(int col =0; col< m; ++col){
            if(col%2==0) {
                for(int row=0; row< n; ++row){
                    System.out.println(A[row][col]);
                }
            }else{
                for(int row=n-1; row>= 0; --row){
                    System.out.println(A[row][col]);
                }
            }
        }
    }
    public static int[][] takeInput(int n, int m){
        int[][] A=new int[n][m];
        for(int row=0; row<n; ++row){
            for(int col=0; col<m; ++col){
                A[row][col]=scn.nextInt();
            }
        }
        return A;
    }
}