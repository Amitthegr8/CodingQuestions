package class_005;
import java.util.Scanner;

public class PrintMatrix{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        for(int r=1;r<=n;++r){
            for(int c=1;c<=n;++c){
                System.out.print(r+""+c+" ");
            }
            System.out.println();
        }
    }
}