package Array_1D;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(sum == arr[i]+arr[j]){
                    System.out.println("index "+i+", index "+j+" = sum");
                }
            }
        }
    }
}
