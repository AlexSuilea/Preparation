package hashtable;

public class MainHashTable {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,1,1,3};
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        System.out.println(numberOfGoodPairs.numIdenticalPairs(arr));
//
//        JewelsAndStones jewelsAndStones = new JewelsAndStones();
//        System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAAbbbbb")); //faster
//
//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSumHM(new int[]{2, 7, 11, 15}, 9)));

//        RansomNote ransomNote = new RansomNote();
//        System.out.println(ransomNote.canConstruct("aa","ab"));
    }
}
