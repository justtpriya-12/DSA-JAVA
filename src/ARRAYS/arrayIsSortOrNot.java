package ARRAYS;

public class arrayIsSortOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 6,5, 6};
        int isSort = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1]){
            } else{
                isSort = 0;
                break;
            }
        }
        if(isSort == 0){
            System.out.println("Array is not sort");
        } else{
            System.out.println("Array is sort");
        }
    }
}
