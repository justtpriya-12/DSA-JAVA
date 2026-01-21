package Array_1D;

import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40};
     int[] x = arr;//x is shallow copy of arr
     x[0] = 100;
     System.out.println(arr[0]);

     int a = 4;//4 byte leta hai ye
     int[] ar = {23,34,45,56};//16 byte
     int[] y = Arrays.copyOf(ar, ar.length);//deep copy
     y[0] = 100;
        System.out.println(y[0]);
        System.out.println(ar[0]);
    }
}
