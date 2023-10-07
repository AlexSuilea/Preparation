package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        if(nums.length < 3) return result;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length - 1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) right--;
                else if(sum < 0) left++;
                else {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    int lastLeftOccurrence = nums[left];
                    int lastRightOccurrence = nums[right];
                    while(left < right && lastLeftOccurrence == nums[left]) left++;
                    while(left < right && lastRightOccurrence == nums[right]) right--;
                }
            }
        }
        return result;
    }
}
