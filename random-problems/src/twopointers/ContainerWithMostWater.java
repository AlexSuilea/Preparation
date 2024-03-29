package twopointers;

public class ContainerWithMostWater {
    public int maxAreaBruteForce(int[] height) {
        int maxArea = 0;

        for(int i=0; i<height.length; i++) {
            for(int j=i+1; j<height.length; j++){
                int area = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(area, maxArea);
            }
        }

        return maxArea;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(area, maxArea);

            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
