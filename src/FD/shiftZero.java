package FD;

public class shiftZero {
    public static void main(String[] args) {
        int[] arr = {0, 23, 65, 0, 87, 0, 45};
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]  != 0){
                arr[k] = arr[i];
                k++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
//rain water trapping
//two sum
//valid parenthesis
//maximum subarray
//consecutive subarray
//sliding window maximun
//maximum subarray after one deletion
//count of range sum
