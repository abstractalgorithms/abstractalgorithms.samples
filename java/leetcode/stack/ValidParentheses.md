# Valid Parentheses

Check if a string of brackets is valid using a stack to match pairs.

## Problem Statement
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if:
1. Open brackets are closed by the same type of brackets.
2. Open brackets are closed in the correct order.

## Example Question and Expected Output

1. 
Input: `"{[()]}"`
Output: `true`

2. 
Input: `"{[(])}"`
Output: `false`

## Approach ( Theory )
1. **Use a Stack**: Iterate through the string, pushing opening brackets onto the stack.