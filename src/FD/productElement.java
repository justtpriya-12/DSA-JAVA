package FD;

import java.util.Scanner;

public class productElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];
        int product = 1;
        for(int i =  n-1; i >= 0; i--){
            result[i] = product;
            product = product*arr[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(result[i]+" ");
        }
    }
}
//int left = 1;
//for(int i = 0; i < n; i++){
//    res[i] = left;
//}
//int right = 1;
//for(int i = n-1; i >= 0; i--){
//    res[i]*=right;
//    right*= nums[i];
//        }