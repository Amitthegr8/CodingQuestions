package T01_GettingStarted;
import java.util.Scanner;
public class P09_InverseOfNumber {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("enter num: ");
        int num=scn.nextInt();
        int ans;
        ans=InverseRightToLeft(num);
        System.out.println("InverseRightToLeft of "+num+": "+ans);
        ans=InverseLeftToRight(num);
        System.out.println("InverseLeftToRight of "+num+": "+ans);
    }
    public static int InverseRightToLeft(int num){
        int count=1;
        int multiple,ans=0;
        while(num>0){
            multiple=(int)Math.pow(10, (num%10)-1);
            ans+=count*multiple;
            ++count;
            num/=10;
        }
        return ans;
    }
    public static int InverseLeftToRight(int num){
        int count=countDigits(num);
        int nod=count;
        int multiple,ans=0;
        while(num>0){
            multiple=(int)Math.pow(10, count-(num%10));
            ans+=nod*multiple;
            --nod;
            num/=10;
        }
        return ans;
    }
    public static int countDigits(int num){
        int count=0;
        while(num>0){
            ++count;
            num/=10;
        }
        return count;
    }
}
