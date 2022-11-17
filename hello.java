import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello AMit Pandey.\nInput number: ");
        int n = scn.nextInt();
        System.out.println(n + " is the number you input.");
        scn.close();
    }
}