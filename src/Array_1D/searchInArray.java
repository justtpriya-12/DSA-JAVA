package Array_1D;

import java.util.Scanner;

public class searchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //target
        int target = sc.nextInt();

        boolean found = false;

// this print not found n times
//        for(int i = 0; i < n; i++){
//            if(arr[i] == target){
//                System.out.println("Find");
//            } else {
//                System.out.println("Not Found");
//            }
//        }


        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }

        if(found == true){
            System.out.println("find");
        } else {
            System.out.println("Not find");
        }
    }
}
