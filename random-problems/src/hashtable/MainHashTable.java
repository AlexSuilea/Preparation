package hashtable;

public class MainHashTable {
    public static void main(String[] args) {
//        int[] arr = new int[] {1,2,3,1,1,3};
//        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
//        System.out.println(numberOfGoodPairs.numIdenticalPairs(arr));
//
//        JewelsAndStones jewelsAndStones = new JewelsAndStones();
//        System.out.println(jewelsAndStones.numJewelsInStones("aA", "aAAbbbbb")); //faster
//
//        TwoSum twoSum = new TwoSum();
//        System.out.println(Arrays.toString(twoSum.twoSumHM(new int[]{2, 7, 11, 15}, 9)));

//        RansomNote ransomNote = new RansomNote();
//        System.out.println(ransomNote.canConstruct("aa","ab"));
//        FindTheSecondLetterInAString.SecondLetter("suilea mihai alexandru");
//        TopKElement topKElement = new TopKElement();
//        System.out.println(Arrays.toString(topKElement.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));

        ValidSudoku validSudoku = new ValidSudoku();
        char[][] board = new char[][]
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(validSudoku.isValidSudoku2(board));
        char[][] board2 = new char[][]
                {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(validSudoku.isValidSudoku2(board2));
    }
}
