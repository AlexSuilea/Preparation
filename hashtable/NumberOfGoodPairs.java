package hashtable;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> mapPairs = new HashMap<>();

        for(Integer num: nums) {
            if(!mapPairs.containsKey(num)){
                mapPairs.put(num, 1);
            } else {
                count += mapPairs.get(num);
                mapPairs.put(num, mapPairs.get(num) + 1);
            }
        }
        return count;
    }
}
