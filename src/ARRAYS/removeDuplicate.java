package ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int index = 0;
        for(int it : set){
            arr[index] = it;
            index++ ;
        }
        for(int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
