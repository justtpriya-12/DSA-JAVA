package ARRAYS;

public class moveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 0, 5};
        int j = 0;
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i < temp.length;i++){
            arr[i] = temp[i];
        }
        for(int i = temp.length; i < arr.length; i++){
            arr[i] = 0;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
