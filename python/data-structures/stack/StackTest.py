from stack.Stack import Stack

def stack_test():
    stack = stack.Stack();
    stack.push(1)
    stack.push(2)
    stack.push(3)
    print(stack.peek())
    print(stack.pop())
    print(stack.peek())

stack_test()