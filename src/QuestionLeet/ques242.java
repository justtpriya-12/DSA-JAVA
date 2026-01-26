package QuestionLeet;

import java.util.*;

public class ques242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "man agra";
        int s1 = s.length();
        int t1 = s.length();
        Map<Character, Integer> map = new HashMap<>();
        if(s1 != t1){
            System.out.println("Not Anagram");
            return;
        }
        for(int i = 0; i < s1; i++){
            Character ss = s.charAt(i);
            Character st = t.charAt(i);
            map.put(ss, map.getOrDefault(ss, 0)+1);
            map.put(st, map.getOrDefault(st, 0)-1);
        }
        for(int i : map.values()){
            if(i != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
