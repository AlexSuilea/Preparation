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

        for(int element: map.values()){
            if(max1 < element){
                max2 = max1;
                max1 = element;
            } else if(max2 < element){
                max2 = element;
            }
        }

        List<Character> listOfChars = new ArrayList<>();

        for(Character ch: map.keySet()) {
            if(map.get(ch) == 1) {
                listOfChars.add(ch);
            }
        }

        System.out.println(listOfChars);

        List<String> result = new ArrayList<>();

        for(Character ch: map.keySet()) {
            if(map.get(ch) > 1) {
                result.add(ch + map.get(ch).toString());
            }
        }

        System.out.println(result);
    }
}
