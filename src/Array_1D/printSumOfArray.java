package Array_1D;

import java.util.Scanner;

public class printSumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        //sum
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum :"+sum);
    }
}
