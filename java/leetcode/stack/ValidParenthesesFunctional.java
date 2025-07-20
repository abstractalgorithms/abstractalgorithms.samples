package stack;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesesFunctional {

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = Map.of('}', '{', ')', '(', ']', '[');

        for (char c : input.toCharArray()) {
            if (pairs.containsValue(c)) {
                stack.push(c);
            } else if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Input: " + isValid(input));
    }
}