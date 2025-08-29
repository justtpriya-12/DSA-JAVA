package Patterns;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((j+i)%2 == 1){
                    System.out.print("0 ");
                } else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
