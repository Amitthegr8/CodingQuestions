package T01_GettingStarted;
import java.util.Scanner;
public class P14_BenjaminBulbs {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        // only perfect squares have odd number of fluctuations
        for(int bulb=1;bulb*bulb<=n;++bulb){
            System.out.println(bulb*bulb);
        }
    }
}
