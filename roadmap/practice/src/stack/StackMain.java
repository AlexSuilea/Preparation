package stack;

public class StackMain {
    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("()"));
        System.out.println(ValidParentheses.isValid("()[]{}"));
        System.out.println(ValidParentheses.isValid("(]"));
        System.out.println(ValidParentheses.isValid("(()))"));
    }
}
