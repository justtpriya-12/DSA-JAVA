package ARRAYS;

public class leftRotateByDOptimal {
    public static void reverse(int arr[], int j, int i){
        while(j <= i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
            i--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5,6};
        int d = 4;


        reverse(arr, 0,d-1 );
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}
