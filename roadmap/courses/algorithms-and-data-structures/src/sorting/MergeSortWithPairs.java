package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSortWithPairs {
    public static List<Pair> mergeSort(List<Pair> pairs) {
        int left = 0;
        int right = pairs.size() - 1;
        return mergeSortHelper(pairs, left, right);
    }

    private static List<Pair> mergeSortHelper(List<Pair> pairs, int left, int right) {
        if(left<right) {
            int mid = (left+right)/2;

            mergeSortHelper(pairs, left, mid);
            mergeSortHelper(pairs, mid+1, right);
            merge(pairs, left, mid, right);
        }

        return pairs;
    }

    private static void merge(List<Pair> pairs, int left, int mid, int right) {

        List<Pair> tempLeftPairs = new ArrayList<>(pairs.subList(left, mid+1));
        List<Pair> tempRightPairs = new ArrayList<>(pairs.subList(mid+1, right+1));

        int i = 0;
        int j = 0;
        int k = left;

        while(i<tempLeftPairs.size() && j<tempRightPairs.size()) {
            if(tempLeftPairs.get(i).getKey() <= tempRightPairs.get(j).getKey()) {
                pairs.set(k, tempLeftPairs.get(i));
                i++;
            } else {
                pairs.set(k, tempRightPairs.get(j));
                j++;
            }
            k++;
        }

        while(i<tempLeftPairs.size()) {
            pairs.set(k, tempLeftPairs.get(i));
            i++;
            k++;
        }

        while(j<tempRightPairs.size()){
            pairs.set(k, tempRightPairs.get(j));
            j++;
            k++;
        }
    }
}
