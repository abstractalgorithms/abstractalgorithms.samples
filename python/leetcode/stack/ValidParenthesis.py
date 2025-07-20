class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop() if not len(self.items) == 0 else None

    def peek(self):
        return self.items[-1] if not len(self.items) == 0 else None

def is_valid(input: str) -> bool:
    stack = Stack()
    parenthesis_array = list(input)

    for char in parenthesis_array:
        if char in ['(', '{', '[']:
            stack.push(char)
        elif char == ')':
            if stack.peek() != '(':
                return False
            else:
                stack.pop()
        elif char == ']':
            if stack.peek() != '[':
                return False
            else:
                stack.pop()
        elif char == '}':
            if stack.peek() != '{':
                return False
            else:
                stack.pop()

    return True

def main():
    input = "{[({)]}"
    print(is_valid(input))

main()