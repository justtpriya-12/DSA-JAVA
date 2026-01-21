package Array_1D;

import java.util.Scanner;

public class reverseFromkElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //reverse from k index
        int k = sc.nextInt();

        int j = n-1;
        int temp;
        int i = k ;
        while(i <  j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int m = 0; m < n; m++){
            System.out.print(arr[m]+" ");
        }
    }
}
