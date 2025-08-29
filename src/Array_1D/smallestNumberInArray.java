package Array_1D;

import java.util.Scanner;

public class smallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //output
        int s = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < arr[0]){
                arr[0] = arr[i];
            }
        }

        System.out.println("Smallest number :"+arr[0]);
    }
}
