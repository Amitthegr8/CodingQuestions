package class_008;
import java.util.Scanner;
public class Theory {
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int n=scn.nextInt();
        int[] arr=new int [n];
        
        takeInput(arr);
        System.out.println();
        printArray(arr);
        System.out.println();

        int data=scn.nextInt();
        System.out.println(firstIndex(arr, data));

        data=scn.nextInt();
        System.out.println(lastIndex(arr, data));
    }
    public static void takeInput(int[] arr){
        for(int i=0;i<arr.length;++i){
            arr[i]=scn.nextInt(); // setter
        }
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;++i){
            System.out.println(arr[i]); // getter
        }
        System.out.println();
    }

    public static boolean findElement(int[] arr,int data){
        boolean ans=false;
        for(int i=0;i<arr.length;++i){
            if(arr[i]==data){
                ans=true;
                return ans;
            }
        }
        return ans;
    }

    public static int maximum(int[] arr){
        // int max=arr[0]; // won't work if array size is zero
        int maxEle=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;++i){
            if(arr[i]>maxEle) {
                maxEle=arr[i];
            }
        }
        return maxEle;
    }
    public static int minimum(int[] arr){
        // int min=arr[0]; // won't work if array size is zero
        int minEle=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;++i){
            if(arr[i]<minEle) {
                minEle=arr[i];
            }
        }
        return minEle;
    }
    // 2 3 4 4 4 4 4 4 4 2
    public static int firstIndex(int[] arr,int data){
        int fi=-1;
        for(int i=arr.length-1;i>-1;--i){ // or fist index is last indexfrom back of array
            if(arr[i]==data){
                fi=i;
                // break;
            }
        }
        return fi;
    }
    public static int lastIndex(int[] arr,int data){
        int li=-1;
        for(int i=0;i<arr.length;++i){
            if(arr[i]==data){
                li=i;
            }
        }
        return li;
    }
}
