package ARRAYS;

public class secSmallestEleInAnArray {
    public static void main(String[] args) {
        int[] arr= {12, 32, 3, 5, 15, 200, 100};
        int min = arr[0];
        int smin = -1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                smin = min;
                min = arr[i];
            } else if(arr[i] != min && arr[i] < smin) {
                smin = arr[i];
            }
        }
        System.out.println(smin +" "+min);
    }
}
