package Array_1D;

public class passingArrayToMethods {
    public static void main(String[] args) {
//        int x = 10;
//        change(x);
//        System.out.println(x);//we pass our variable to method variable pass by value

        int[] x = {10,3,29,39};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);//whenever we pass our array to method array pass by reference
    }
//    public static void change(int x){
//        x = 20;
//    }
    public static void change(int[] y){
        y[2] = 99;
    }
}
