package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSorting {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(InsertionSort.insertionSort(new int[]{6,2, 5, 7, 3, 4, 6, 1})));
//        List<Pair> pairs = Arrays.asList(new Pair(5, "apple"), new Pair(2, "banana"), new Pair(9, "cherry"));
//        System.out.println(InsertionSortWithPairs.insertionSort(pairs));
//        System.out.println(Arrays.toString(MergeSort.mergeSort(new int[]{7, 2, 5, 7, 3, 4, 6, 1}, 0, 7)));
//        List<Pair> pairs = Arrays.asList(new Pair(5, "apple"), new Pair(2, "banana"), new Pair(9, "cherry"),
//                new Pair(1, "date"), new Pair(9, "elderberry"));
//        System.out.println(MergeSortWithPairs.mergeSort(pairs));
//        System.out.println(Arrays.toString(QuickSort.quickSort(new int[]{7, 2, 5, 7, 3, 4, 6, 1}, 0, 7)));
//        List<Pair> pairs = Arrays.asList(new Pair(5, "apple"), new Pair(2, "banana"), new Pair(9, "cherry"),
//                new Pair(1, "date"), new Pair(9, "elderberry"));
//        System.out.println(QuickSortWithPairs.quickSort(pairs));
//        System.out.println(Arrays.toString(BucketSort.bucketSort(new int[]{1,1,0,0,2,0,2,2})));
        int[] colors = new int[]{1,1,0,0,2,0,2,2};
        SortColors.sortColors(colors);
        System.out.println(Arrays.toString(colors));
    }
}