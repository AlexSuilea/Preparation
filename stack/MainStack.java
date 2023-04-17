package stack;

public class MainStack {
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("{[()]}"));
    }
}
