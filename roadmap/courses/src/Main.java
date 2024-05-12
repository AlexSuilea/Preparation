import dynamicarray.ConcatenationOfArray;
import staticarray.RemoveDuplicatesFromSortedArray;
import staticarray.RemoveElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(ConcatenationOfArray.getConcatenation(new int[]{1, 3, 2, 1})));

//        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {1,1,2}));
//        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
//        System.out.println(RemoveElement.removeElement(new int[] {3,2,2,3},3));
//        System.out.println(RemoveElement.removeElement(new int[] {0,1,2,2,3,0,4,2},2));
    }
}