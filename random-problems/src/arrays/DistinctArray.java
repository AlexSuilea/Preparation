package arrays;

/*
How to get distinct elements from an array by avoiding duplicates elements. Example: int[] nums = {5,2,7,2,4,7,8,2,3}
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctArray {

    public static List<Integer> resolveWithArray(int[] nums) {
        List<Integer> distinctList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            boolean isDistinct = false;
            for(int j=0; j<i; j++){
                if(nums[i] == nums[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct) {
                distinctList.add(nums[i]);
            }
        }
        return distinctList;
    }

    public static List<Integer> resolveWithHS(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for (int num : nums) {
            distinct.add(num);
        }

        return new ArrayList<>(distinct);
    }
}
