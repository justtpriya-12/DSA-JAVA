package FD;

import java.util.Scanner;

public class secLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max, max2;
        if (arr[0] > arr[1]) {
            max = arr[0];
            max2 = arr[1];
        } else {
            max = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < n ; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
