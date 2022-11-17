package class_003;
import java.util.Scanner;
public class P002_BenjaminBulbs {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        for(int bulb=1;bulb*bulb<=n;++bulb){
            System.out.println(bulb*bulb);
        }
    }
}
