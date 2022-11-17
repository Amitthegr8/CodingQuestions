package class_002;
import java.util.Scanner;
public class P001_functions{

    public static Scanner scn=new Scanner(System.in);

    public static void main(String[] args){
        // no return no args
        printMessage();

        // only args no return
        int low=scn.nextInt();
        int high=scn.nextInt();
        printTableInRange(low, high);
    }
    public static void printTable(int table){
        for (int num = 1; num <= 10; ++num) {
            System.out.println(table+"  X  "+num+"  =  "+(table*num));
        }
    }
    public static void printTableInRange(int lo,int hi){
        for(int i=lo;i<=hi;++i){
            System.out.println("\nTable of "+i+": ");
            printTable(i);
        }
    }
    // no return type no args
    public static void printMessage(){
        System.out.println("Hello AMit Pandey");
    }
}