package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheSecondLetterInAString {
    public static void SecondLetter(String name) {
        name = name.toLowerCase();
        name = name.replaceAll("\\s","");

        char[] arrayOfChars = name.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(Character ch: arrayOfChars){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        int max1 = -1, max2 = -1;

        for(char element: map.keySet()){
            if(max1 < map.get(element)){
                max2 = max1;
                max1 = map.get(element);
            } else if(max2 < map.get(element)){
                max2 = map.get(element);
            }
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() == max2) {
                System.out.println(entry.getKey());
                break;
            }
        }



        List<String> result = new ArrayList<>();

        for(Character ch: map.keySet()) {
            if(map.get(ch) == max2) {
                result.add(ch + map.get(ch).toString());
            }
        }

//        for(Character ch: map.keySet()) {
//            if(map.get(ch) > 1) {
//                result.add(ch + map.get(ch).toString());
//            }
//        }

        System.out.println(result);
    }
}
