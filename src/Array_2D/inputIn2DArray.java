package Array_2D;

import java.util.Scanner;

public class inputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        //print length
        System.out.println(arr.length);

        System.out.println("input arr :");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Print arr:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
