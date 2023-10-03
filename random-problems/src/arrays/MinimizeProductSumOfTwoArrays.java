package arrays;

import java.util.Arrays;

public class MinimizeProductSumOfTwoArrays {
    public int minProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); //O(nlogn)
        Arrays.sort(nums2);

        int result = 0;
        int n = nums1.length;

        for(int i=0; i<n; i++){
            result += nums1[i] * nums2[n-1-i];
        }

        return result;
    }
}
