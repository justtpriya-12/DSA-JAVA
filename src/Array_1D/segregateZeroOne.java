package Array_1D;

import java.util.Arrays;

public class segregateZeroOne  {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};

        int numberOfZero = 0;
        int numberOfOne = 0;

        for(int ele : arr){
            if(ele == 0) numberOfZero++;
            else if (ele == 1) numberOfOne++;
        }

        for(int i = 0; i < arr.length; i++){
            if(i < numberOfZero){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
