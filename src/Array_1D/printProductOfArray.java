package Array_1D;

import java.util.Scanner;

public class printProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //output
        int product = 1;
        for(int i = 1; i < n; i++){
            product = product*arr[i];
        }
        System.out.println("product :"+product);
    }
}
