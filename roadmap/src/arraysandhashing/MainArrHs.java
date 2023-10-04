package arraysandhashing;

import java.util.Arrays;

public class MainArrHs {
    public static void main(String[] args) {
//        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
//        System.out.println(containsDuplicate.containsDuplicate(new int[]{1,2,3,1}));

//        ValidAnagram validAnagram = new ValidAnagram();
//        System.out.println(validAnagram.isAnagram("anagram","nagaram"));
//        System.out.println(validAnagram.isAnagram("rat","car"));

//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{3,2,4}, 6)));

        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println(groupAnagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
}
