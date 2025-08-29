package Array_1D;

import java.util.Scanner;

public class outputInputArray {
    public static void main(String[] args) {
        int[] arr = {5, -6, 7, 45, 56, -98};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        System.out.println("Print by loop :");
        for(int i = 0; i < 6; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        int n = arr.length;
        System.out.println("use of (arr.length) :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        //default value 0
        System.out.println("Take 0 as input in empty array:");
        int[] arr2 = new int[7];
        for(int i = 0; i < 7; i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input :");
        for(int i = 0; i < 7; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.println("Print :");
        for(int i = 0; i < 7; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
