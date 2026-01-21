package Array_1D;

import java.util.Arrays;

public class sortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {4,12,45,-65,-63,67};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
