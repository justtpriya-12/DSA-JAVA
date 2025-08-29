package Array_1D;

import java.util.Scanner;

public class printNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        //input
        System.out.print("Input :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //output
        System.out.print("Output :");
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
