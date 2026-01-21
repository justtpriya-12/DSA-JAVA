package ARRAYS;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 34, 54, 36, 23};
        int target = 23;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.print("at index "+i);
                break;
            }
        }
    }
}
