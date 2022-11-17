package T01_GettingStarted;
import java.util.Scanner;
public class P13_PythagoreanTriplet {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
       boolean ans=pythagoras(a,b,c);
       System.out.println(ans);
    }
    public static boolean pythagoras(int a,int b, int c){
        if(a*a+b*b==c*c) {
            return true;
        }else if (b*b+c*c==a*a){
            return true;
        } else if(a*a+c*c==b*b){
            return true;
        } 

        return false;
    }
}