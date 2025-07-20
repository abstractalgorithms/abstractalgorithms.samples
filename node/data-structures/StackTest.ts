const { Stack } = require("./Stack");

function testStack() {
    const stack = new Stack();

    console.log("Testing Stack Implementation\n---------------------------");
    // Test empty stack
    console.log("Is stack empty?", stack.isEmpty()); // true
    console.log("Pop on empty stack:", stack.pop()); // undefined

    // Push elements
    stack.push(1);
    stack.push(2);
    stack.push(3);
    console.log("Stack size after pushes:", stack.size()); // 3
    console.log("Top item (peek):", stack.peek()); // 3

    // Pop elements
    console.log("Popped item:", stack.pop()); // 3
    console.log("Stack size after pop:", stack.size()); // 2
    console.log("Is stack empty?", stack.isEmpty()); // false
    console.log("Popped item:", stack.pop()); // 2
    console.log("Popped item:", stack.pop()); // 1
    console.log("Is stack empty?", stack.isEmpty()); // true
    console.log("Pop on empty stack:", stack.pop()); // undefined
}

testStack();
