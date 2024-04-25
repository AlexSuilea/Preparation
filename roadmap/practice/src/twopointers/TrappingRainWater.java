package twopointers;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int sum = 0;
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];

        while(l<r){
            if(height[l] < height[r]){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                sum += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                sum += rightMax - height[r];
            }
        }
        return sum;
    }

    public static int trap2(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int sum = 0;

        while(left < right) {
            if(height[left] < height[right]){
                left++;
                leftMax = Math.max(leftMax, height[left]);
                sum += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                sum += rightMax - height[right];
            }
        }
        return sum;
    }
}
