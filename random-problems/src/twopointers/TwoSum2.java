package twopointers;

public class TwoSum2 {

    public int[] solution2(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;

        while(left<right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }

        return new int[] {-1, -1};
    }
    public int[] solution1(int[] nums, int target){

        for(int i=0; i < nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i+1,j+1};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
