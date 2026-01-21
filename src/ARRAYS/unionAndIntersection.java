package ARRAYS;

import java.util.*;

public class unionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 4, 5};

        Set<Integer> set = new HashSet<> ();
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }
        int[] union = new int[set.size()];
        int index = 0;
        for(int it : set){
            union[index] = it;
            index++;
        }
        for(int i = 0; i < union.length; i++){
            System.out.print(union[i]+" ");
        }
    }
}
