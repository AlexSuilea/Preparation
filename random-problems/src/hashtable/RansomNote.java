package hashtable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();

        for(char ch: magazine.toLowerCase().toCharArray()) {
            if(!magazineMap.containsKey(ch)){
                magazineMap.put(ch, 1);
            } else {
                magazineMap.put(ch, magazineMap.get(ch) + 1);
            }
        }

        for(char ch: ransomNote.toLowerCase().toCharArray()) {
            if(!magazineMap.containsKey(ch) || magazineMap.get(ch) == 0) {
                return false;
            } else {
                magazineMap.put(ch, magazineMap.get(ch) - 1);
            }

        }
        return true;
    }
}
