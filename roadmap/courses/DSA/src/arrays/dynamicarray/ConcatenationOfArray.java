package arrays.dynamicarray;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int j = nums.length;
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[j] = nums[i];
            j++;
        }

        return ans;
    }
}
