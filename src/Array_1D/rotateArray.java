package Array_1D;

import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int r = sc.nextInt();//rotate from r element

        int x = r;
        int temp;
        int y = 0;
        while(y<x){
            temp = arr[y];
            arr[y] = arr[x];
            arr[x] = temp;
            y++;
            x--;
        }


        int m = n-1;

        int l = r+1;
        while(l<m){
            temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m--;
        }




        int j = n-1;

        int i = 0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k < n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
