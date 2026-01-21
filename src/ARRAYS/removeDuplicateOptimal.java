package ARRAYS;

public class removeDuplicateOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 4};
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int j = 0; j < i+1; j++){
            System.out.print(arr[j]+" ");
        }
    }
    
}
