package T01_GettingStarted;
import java.util.Scanner;
public class P10_RotateNum {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int num=scn.nextInt();
        int rot=scn.nextInt();
        // my solutions
        // int ans=rotation(num, rot);
        // int ans=rotationWithoutPower(num, rot);
        // sir's solution
        int ans=rotationWithoutPowerSir(num,rot);
        System.out.println(ans);

        // System.out.println(-17%4);   should be 3 but computer gives -1
        // System.out.println(-17/4);   should be -5 but computer gives -4
    }
    public static int rotation(int num,int rot){
        int length=countDigits(num);
        // rot=rot%length;
        // if(rot<0) rot+=length
        // OR we could write
        rot=(rot%length+length)%length;
       
        int a=num/(int)Math.pow(10, rot);
        int b=num%(int)Math.pow(10, rot);
        int ans=b*(int)Math.pow(10,length-rot)+a;
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
    public static int rotationWithoutPower(int num,int rot){
        int length=countDigits(num);
        rot=(rot%length+length)%length;
        int power1=1,power2=1;
        for(int i=1;i<=rot;++i){
            power1*=10;
        }
        for(int i=1;i<=length;++i){
            power2*=10;
        }
       
        int a=num/power1;
        int b=num%power1;
        int ans=b*(power2/power1)+a;
        return ans;
    }
    // Sir's solution
    public static int rotationWithoutPowerSir(int num,int rot){
        int length=countDigits(num);
        rot=(rot%length+length)%length;
        int div=1,mul=1;
        for(int i=1;i<=length;++i){
            if(i<=rot){
                div*=10;
            }else{
                mul*=10;
            }
        }
        int a=num/div;
        int b=num%div;
        int ans=b*mul+a;
        return ans;
    }
}
