package Patterns;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int no = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(no%2 != 0){
                    System.out.print(no+" ");
                    no += 2;
                }
            }
            System.out.println();
        }
    }
}
