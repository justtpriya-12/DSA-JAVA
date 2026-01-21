package Array_1D;

/*
FOR EACH Loop :
1. used to traverse data structure.
2. can not modify array elements using for loop element
*/

public class foEachLoop {
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9};
        for(int ele : arr){
            System.out.print(ele+" ");
        }

        System.out.println();

        for(int ele : arr){
            ele *= 2;
        }

        //it does not modify the array
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
