package Array_1D;

import java.util.Scanner;

public class missingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n-1; i++){
            arr[i] = sc.nextInt();
        }

        int sum = (n*(n+1))/2;
        //System.out.println(sum);

        int arrSum = 0;
        for(int i = 0; i < n-1; i++){
            arrSum = arrSum + arr[i];
            //System.out.println(arrSum);
        }
        //System.out.println(arrSum);

        int missingArray = sum - arrSum;
        System.out.println("Missing number is :"+missingArray);
    }
}
