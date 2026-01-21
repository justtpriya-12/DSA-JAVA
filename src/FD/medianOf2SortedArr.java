package FD;

import java.util.Arrays;
import java.util.Scanner;

public class medianOf2SortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] brr = new int[m];
        for(int i = 0; i < n; i++){
            brr[i] = sc.nextInt();
        }
        int[] merge =  new int[n+m];
        for(int i =0; i < n; i++){
            merge[i] = arr[i];
        }
        int j = 0;
        for(int i = n ; i < merge.length; i++){
            merge[i] = brr[j];
            j++;
        }
        Arrays.sort(merge);
        double median;
        int mid = merge.length / 2;
        if(merge.length % 2 == 0){
            median = (merge[mid-1]+merge[mid])/2.0;
            System.out.println(median);
        } else {
            median = merge[mid];
            System.out.print(median);
        }
    }
}
