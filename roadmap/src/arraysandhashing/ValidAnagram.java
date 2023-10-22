package arraysandhashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: sArr) {
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }

        for(char ch: tArr){
            if(!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
        }

        for(int val: map.values()){
            if(val != 0) return false;
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch: sChars){
            map.putIfAbsent(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }

        for(char ch: tChars){
            if(!map.containsKey(ch)) return false;
            else map.put(ch, map.get(ch) - 1);
        }

        for(int val: map.values()){
            if(val != 0) return false;
        }

        return true;
    }
}
