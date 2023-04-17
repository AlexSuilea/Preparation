package hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(target == nums[i] + nums[j]){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSumHM(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public int[] twoSumHM2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No elements found");
    }
}
