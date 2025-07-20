package stack;

public class Stack {
    int items[] = new int[5];
    int top = 0;
    
    public void push(int item) {
        items[top] = item;
        top++;
    }

    public int pop(){
        return items[top--];
    }

    public int peek(){
        return items[top];
    }
}
