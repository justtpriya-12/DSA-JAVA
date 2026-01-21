package Array_2D;

public class outputIn2DArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[][] arr1 = {{6,4,5,6},{1,2,3,4},{3,4,5,6}};

        //print length
        System.out.println(arr.length);

        System.out.println("Print arr :");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Print arr1:");
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
