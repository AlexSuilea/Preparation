package twopointers;

public class ContainerWithMostWater {
    public static int maxAreaBrute(int[] height) {
        int result = 0;

        for(int l=0; l<height.length; l++){
            for(int r=l+1; r<height.length; r++){
                int area = (r-l) * Math.min(height[l], height[r]);
                result = Math.max(area,result);
            }
        }
        return result;
    }

    public static int maxArea(int[] height){
        int result = 0;
        int l = 0, r = height.length - 1;

        while(l<r){
            int area = (r - l) * Math.min(height[r], height[l]);
            result = Math.max(area, result);

            if(height[l] < height[r]) l++;
             else r--;
        }
        return result;
    }
}
