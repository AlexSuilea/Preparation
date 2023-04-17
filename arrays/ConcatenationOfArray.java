package arrays;

public class ConcatenationOfArray {

    public int[] getConcatenation2(int[] nums) {
        if(nums.length < 1) {
            return nums;
        }

        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < nums.length*2; i++) {
            if(i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }

        return ans;
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        int j=0;
        for(int i = nums.length; i < ans.length; i++) {
            ans[i] = nums[j];
            j++;
        }

        return ans;
    }
}
