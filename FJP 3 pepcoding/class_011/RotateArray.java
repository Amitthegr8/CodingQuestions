package class_011;
import java.util.Scanner;

public class RotateArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[] args){
        int arrSize=scn.nextInt();
        int[] arr=inputArray(arrSize);
        int rotation=scn.nextInt();

        // transform into simplified positive rotation
        rotation%=arrSize;
        if(rotation<0) rotation=(rotation+arrSize)%arrSize;

        // // answer: print last rotation numbers
        // for(int i=arrSize-rotation; i<arrSize;++i){
        //     System.out.print(arr[i]+" ");
        // }
        // // print remaining numbers
        // for(int i=0; i<arrSize-rotation; ++i){
        //     System.out.print(arr[i]+" ");
        // }

        // need to actually replace in array

        // a -> b -> c -> d -> e  +3
        // last 3 need to be first  c(correct) -> b -> a(replaced) -> d -> e ||  c -> d(correct) -> a -> b(replace) -> e 
        // c -> d -> e no need this wont be enough

        // using algorithm : (AB)' = B'A' and (BA)'=A'B'  let us divide array into 2 parts
        // second part = B needs to come first , and first part=A need to go at back so we want BA
        // BA = (B')'.(A')' = (A'B')'

        // applying algorithm
        // reverse second = B part

        // int i = arrSize - rotation; // i = starting point
        // for( int j=0; j< rotation/2 ; ++j){
        //     int temp=arr[i+j];
        //     arr[i+j]=arr[arrSize-1-j];
        //     arr[arrSize-1-j]=temp;
        // }

        // // aply on part A
        // for(int j=0; j<i/2; ++j){
        //     int temp=arr[j];
        //     arr[j]=arr[i-1-j];
        //     arr[i-1-j]=temp;
        // }

        // // reverse entire array
        // for(int j=0; j<arrSize/2; ++j){
        //     int temp=arr[j];
        //     arr[j]=arr[arrSize-1-j];
        //     arr[arrSize-1-j]=temp;
        // }

        // above works lets try using single function
       
        ArrayReverse(arr, arrSize-rotation, arrSize-1);  // reverse first part
        ArrayReverse(arr, 0, arrSize-rotation-1); // // reverse second part
        ArrayReverse(arr, 0, arrSize-1);

        // print
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    // function for reversal
    public static void ArrayReverse(int[] arr, int i, int j){
        int temp;
        for(int k=0; k<(j+1-i)/2 ; ++k){
            temp = arr[i+k];
            arr[i+k]=arr[j-k];
            arr[j-k]=temp;
        }
        
    }

    // function for inputting arrays
    public static int[] inputArray(int n){
        int[] arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=scn.nextInt();
        }
        return arr;
    }
}