package Methods;

public class returnType {

    public static int num(){
        System.out.println("Hello");
        System.out.println("Hii");
        return 10;
    }

    public static void main(String[] args) {
        int x = num();
        System.out.println(3+x);
        num();
        System.out.println(num());
    }
}
