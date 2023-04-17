package hashtable;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int theMajorityElement(int[] arr){
        if(arr.length==1)
            return arr[0];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]) + 1;
                if(count > (arr.length / 2)){
                    return arr[i];
                } else {
                    map.put(arr[i], count);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        return -1;
    }
}
