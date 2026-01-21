package FD;

import java.util.Scanner;

public class rmvConsecutiveDupliChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            if (result.charAt(i) == result.charAt(i+1)) {
                result.deleteCharAt(i+1);
            } else {
                i++;
            }
        }

        System.out.println(result.toString());
    }
}
//remove consecutive duplicate character in a string