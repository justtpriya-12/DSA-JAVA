package String;
import java.util.*;
public class revString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);

    }
}
