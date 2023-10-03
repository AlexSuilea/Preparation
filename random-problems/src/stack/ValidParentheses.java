package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for(Character ch: s.toCharArray()){
            if(map.containsKey(ch)){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(map.get(open) != ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
