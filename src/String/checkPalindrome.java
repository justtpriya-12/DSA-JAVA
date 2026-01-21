package String;
import java.util.*;
public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
