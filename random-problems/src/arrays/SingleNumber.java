package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> numsMap = new HashMap<>();

        for(Integer num: nums){
            if(!numsMap.containsKey(num)){
                numsMap.put(num, 1);
            } else {
                numsMap.put(num, numsMap.get(num) + 1);
            }
        }

        for(Integer num: numsMap.keySet()){
            if(numsMap.get(num) == 1){
                return num;
            }
        }

        return 0;
    }
}
