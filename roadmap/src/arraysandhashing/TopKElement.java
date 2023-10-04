package arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElement {
    public static int[] topKElement(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.putIfAbsent(num, 0);
            map.put(num, map.get(num) + 1);
        }

        List<Integer> bucket[] = new ArrayList[nums.length+1];
        for(Integer key: map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int[] result = new int[k];
        int idx = 0;

        for(int i=nums.length; i>=0; i--){
           if(bucket[i] != null) {
               for(int val: bucket[i]){
                   result[idx++] = val;
                   if(idx == k){
                       return result;
                   }
               }
           }
        }
        return result;
    }
}
