package stack;

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int num1 = stack.pop();
                    int num2 = stack.peek();
                    int sum = num1 + num2;
                    stack.push(num1);
                    stack.push(sum);
                }
                case "D" -> {
                    int prod = stack.peek() * 2;
                    stack.push(prod);
                }
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(operation));
            }
        }

        for (Integer i : stack) {
            result += i;
        }

        return result;
    }
}
