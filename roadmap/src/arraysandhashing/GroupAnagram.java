package arraysandhashing;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            String sortedStr = sortStr(str);
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private String sortStr(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
