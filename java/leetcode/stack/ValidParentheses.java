package stack;

import java.util.Arrays;
import java.util.Stack;

class ValidParentheses {

    /**
     * Validates if the parentheses in the input string are properly nested and matched.
     *
     * @param input The string containing parentheses to validate.
     * @return true if the parentheses are valid, false otherwise.
     */

    public static boolean isValid(String input) {
        Stack<Character> parenthesisStack = new Stack<>();

        char[] charArray = input.toCharArray();
        boolean isFailed = false;
        for (int i = 0; i < charArray.length; i++) {
            if (!isFailed) {
                if (charArray[i] == '{' || charArray[i] == '[' || charArray[i] == '(' ) {
                    parenthesisStack.push(charArray[i]);
                } else {
                    switch (charArray[i]) {
                        case '}': {
                            if (parenthesisStack.peek().charValue() == '{' ) {
                                parenthesisStack.pop();
                            } else {
                                isFailed = true;
                            }
                        }
                        break;
                        case ')': {
                            if (parenthesisStack.peek().charValue() == '(' ) {
                                parenthesisStack.pop();
                            } else {
                                isFailed = true;
                            }
                        }
                        break;

                        case ']': {
                            if (parenthesisStack.peek().charValue() == '[' ) {
                                parenthesisStack.pop();
                            } else {
                                isFailed = true;
                            }
                        }
                        break;
                    }

                    ;
                }
            } else {
                return !isFailed;
            }
        }

        if (parenthesisStack.isEmpty()) {
            System.out.println("Proper parentheses");
        }

        return parenthesisStack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[({)]}";
        System.out.println("Input: " + isValid(input));
    }
}