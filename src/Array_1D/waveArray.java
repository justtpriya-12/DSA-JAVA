package Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class waveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
//        for(int i = 0 ; i < n; i++){
//            System.out.print(arr[i]+" ");
//        }

        int temp;
        for(int i = 0; i < n-1; i += 2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
