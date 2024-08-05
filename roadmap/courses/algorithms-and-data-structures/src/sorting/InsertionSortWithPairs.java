package sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortWithPairs {
    public static List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            int j = i - 1;
            while(j>=0 && pairs.get(j+1).key < pairs.get(j).key) {
                Pair temp = pairs.get(j);
                pairs.set(j, pairs.get(j + 1));
                pairs.set(j + 1, temp);
                j--;
            }
            List<Pair> clonePairs = new ArrayList<>(pairs);
            result.add(clonePairs);
        }
        return result;
    }
}
