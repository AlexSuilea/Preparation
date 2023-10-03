package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {

    public static List<Integer> findDuplicates(int[] arr){

        Map<Integer, Integer> map = new HashMap<>();

        for(int element: arr){
            if(!map.containsKey(element)){
                map.put(element, 1);
            } else {
                map.put(element, map.get(element)+1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int element: map.keySet()){
            if(map.get(element) > 1){
                result.add(element);
            }
        }
        return result;
    }
}
