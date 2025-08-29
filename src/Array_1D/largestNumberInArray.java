package Array_1D;

import java.util.Scanner;

public class largestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //find largest number
        int l = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > l){
                l = arr[i];
            }
        }
        System.out.println("largest number :"+l);
    }
}
