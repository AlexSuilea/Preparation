package hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map<Character, Integer> mapJewels = new HashMap<>();

        for(char jewel: jewels.toCharArray()) {
            mapJewels.put(jewel, 1);
        }

        for(char stone: stones.toCharArray()) {
            if(mapJewels.containsKey(stone)){
                count++;
            }
        }

        return count;
    }

    public int numJewelsInStonesHS(String jewels, String stones) {
        int count = 0;
        Set<Character> mapJewels = new HashSet<>();

        for(char jewel: jewels.toCharArray()) {
            mapJewels.add(jewel);
        }

        for(char stone: stones.toCharArray()) {
            if(mapJewels.contains(stone)){
                count++;
            }
        }

        return count;
    }
}
