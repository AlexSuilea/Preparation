package hashtable;

import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class NumberSocks {

    public static void solve() {
        List<Integer> socksBox = Arrays.asList(1,3,10,5,3,4,5,1,10,2,10,4,5,6,8,1,7,2,7,6,2,
                9,10,8,9,3,1,10,9,8,5,6,10,7,8,9,1,3,2);
        SortedMap<Integer, Integer> socksMap = new TreeMap<>();

        for(Integer sock: socksBox) {
            if(!socksMap.containsKey(sock)){
                socksMap.put(sock, 1);
            } else {
                socksMap.put(sock, socksMap.get(sock) + 1);
            }
        }

        System.out.println(socksMap);

        for(Integer sock: socksMap.keySet()){
            if(socksMap.get(sock) % 2 == 0) {
                System.out.println("Soseta cu numarul " + sock + " are " + socksMap.get(sock)/2 +" perechi");
            } else {
                System.out.println("Soseta cu numarul " + sock + " are " + socksMap.get(sock)/2 +" perechi si o soseta ramasa");
            }
        }
    }
}
