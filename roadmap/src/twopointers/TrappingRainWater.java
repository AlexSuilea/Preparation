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
}
