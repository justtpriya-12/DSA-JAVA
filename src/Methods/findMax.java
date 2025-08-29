package Methods;

public class findMax {

    public static void max(int a, int b, int c){
        int m = (Math.max(a,Math.max(b,c)));
        System.out.println(m);
    }

    public static void main(String[] args) {
        max(34,67,78);
    }
}
