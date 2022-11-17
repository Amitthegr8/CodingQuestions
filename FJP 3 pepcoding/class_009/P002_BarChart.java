package class_009;

import java.util.*;

public class P002_BarChart {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];

        // take input and find max
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = scn.nextInt();
            if (arr[i] > max)
                max = arr[i];
        }

        // print max rows and n cols
        int floor=max;
        for (int i = 0; i < max; ++i) { // rows = maximumfloors =max
            for (int j = 0; j < n; ++j) { // cols = n
                if(arr[j]>=floor){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            // update floor 
            --floor;
            System.out.println();
        }

    }
}
