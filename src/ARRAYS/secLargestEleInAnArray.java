package ARRAYS;

public class secLargestEleInAnArray {
    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 7, 7, 5};
        int max = ar[0];
        int sMax = -1;
        for(int i = 1; i < ar.length; i++){
            if(ar[i] > max){
                sMax = max;
                max = ar[i];
            } else{
                sMax = ar[i];
            }
        }
        System.out.println(sMax+" "+max);
    }

}
