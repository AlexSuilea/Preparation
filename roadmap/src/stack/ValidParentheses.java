package stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character ch: s.toCharArray()) {
            if(ch == '(')
                stack.push(')');
            else if(ch == '[')
                stack.push(']');
            else if(ch == '{')
                stack.push('}');
            else if(stack.isEmpty() || ch != stack.pop())
                return false;
        }

        return stack.isEmpty();
    }
}
