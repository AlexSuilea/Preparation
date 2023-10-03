package twopointers;

import java.util.Arrays;

public class MainTwoPointers {
    public static void main(String[] args) {
//        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
//        System.out.println(containerWithMostWater.maxArea(new int[]{2,3,4,5,18,17,6}));

        TwoSum2 twoSum2 = new TwoSum2();
        System.out.println(Arrays.toString(twoSum2.solution2(new int[]{2,7,11,15}, 9)));
    }
}
