package arrays;

//Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            switch (i) {
                case 0:
                    result[i] = nums[i];
                    break;
                case 1:
                    result[i] = nums[i - 1] + nums[i];
                    break;
                case 2:
                    result[i] = nums[i - 2] +nums[i - 1] + nums[i];
                    break;
                case 3:
                    result[i] =  nums[i - 3] + nums[i - 2] + nums[i - 1] + nums[i];;
                    break;
            }
        }
        return result;
    }

    public static int[] runningSum2(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            result[i] = sum;
            //result[i] = (nums[i] * (nums[i] + 1))/2;
        }
        return result;
    }

    public static int[] runningSum3(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}
