package ARRAYS;

public class longestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 1, 1, 2, 2 , 3};
        int target = 7;
        int len = 0;
        for(int i = 0; i < arr.length; i++){
             for(int j = i; j < arr.length; j++){
                 int sum = 0;
                 for(int k = i; k < j; k++){
                     sum += arr[k];
                     if(sum == target){
                         len = Math.max(len, j-i+1);
                     }
                 }
             }
        }
        System.out.println(len);
    }
}
