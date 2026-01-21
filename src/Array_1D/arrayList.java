package Array_1D;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(31);
        arr.add(18);
        arr.add(5);
        arr.add(10);

        //print index 2 element
        System.out.println(arr.get(2));

        //add 58 at 3 index {arr[3] = 58}
        arr.set(3,58);

        //print arraylist
        System.out.println(arr);

        //arraylist length
        int n = arr.size();
        for(int i = 0; i < n;  i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        for(int ele : arr){
            System.out.print(ele+" ");
        }

        //25, 31, 18, 58, 10

        arr.add(78);//25, 31, 18, 58, 10, 78
        arr.add(1,13);//25, 13, 31, 18, 58, 10, 78

        arr.remove(arr.size()-1);
        System.out.println();
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);

        int i  = 0, j = arr.size()-1;
        while(i < j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }

        System.out.println(arr);
    }
}
