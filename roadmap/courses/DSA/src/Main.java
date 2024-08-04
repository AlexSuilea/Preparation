import stack.BaseballGame;

public class Main {
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        System.out.println(BaseballGame.calPoints(operations));
        String[] operations1 = {"5","-2","4","C","D","9","+","+"};
        System.out.println(BaseballGame.calPoints(operations1));

//        System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(new int[]{1, 2, 1})));
//        System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(new int[]{1, 3, 2, 1})));

//        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {1,1,2}));
//        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(RemoveElement.removeElement(new int[] {3,2,2,3},3));
//        System.out.println(RemoveElement.removeElement(new int[] {0,1,2,2,3,0,4,2},2));
    }
}