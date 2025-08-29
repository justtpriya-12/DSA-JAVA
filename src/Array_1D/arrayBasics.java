package Array_1D;

public class arrayBasics {
    public static void main(String[] args) {
        int x1 = 6;
        x1 = 16;
        int x2 = 3, x3 = 67;
        int x4 = 78;

        //array
        int[] arr= {66, 33, 677, 788};

        //indexing
        System.out.println(arr[0]);

        //updation & mutation
        arr[2] = 776;
        System.out.println(arr[2]);

        //second method empty array
        int[] arr1 = new int[4]; //4 size empty array
        //initialization
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;

    }
}
