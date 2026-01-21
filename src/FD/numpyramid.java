package FD;

public class numpyramid {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i; j < n; j++) {
                if (k % 3 == 0) {
                    System.out.print((k+1) + " ");
                    k++;
                } else {
                    System.out.print(k + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
