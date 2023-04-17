package arrays;

/*
Write a program that finds top two maximum elements in an array. int[] nums = {5,34,78,2,45,1,99,23}
 */

import java.util.Arrays;
import java.util.List;

public class ThreeMaxims {
    public static List<Integer> twoMaxList(int[] nums) {

        int max1 = -1, max2 = -1, max3 = -1;

        for (int num : nums) {
            if(num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if(num > max2) {
                max3 = max2;
                max2 = num;
            } else if(num > max3) {
                max3 = num;
            }
        }


        return Arrays.asList(max1, max2, max3);
    }
}
