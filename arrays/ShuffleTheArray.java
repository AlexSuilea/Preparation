package arrays;

public class ShuffleTheArray {

    public int[] efficientShuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        for(int i=0; i<n; i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[n+i];
        }

        return result;
    }
    public int[] shuffle(int[] nums, int n) {
        int[] nums1 = new int[nums.length];
        int[] nums2 = new int[nums.length];
        int[] ans = new int[nums.length];

        int[] newNums1 = new int[nums.length/2];
        int[] newNums2 = new int[nums.length/2];

        int j=0;
        for(int i=0; i<nums.length; i++){
            if(i<nums.length/2){
                nums1[i] = nums[i];
            } else {
                nums2[i] = nums[i];
                j++;
            }
        }

        j=0;
        for(int i=0; i<nums.length; i++){
            if(nums1[i]!=0){
                newNums1[j] = nums1[i];
                j++;
            }
        }

        j=0;
        for(int i=0; i<nums.length; i++){
            if(nums2[i]!=0){
                newNums2[j] = nums2[i];
                j++;
            }
        }

        j=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                ans[i] = newNums1[j];
            } else {
                ans[i] = newNums2[j];
                j++;
            }
        }

        return ans;
    }
}

//Input: nums = [1,1,2,2], n = 2
//        Output: [1,2,1,2]