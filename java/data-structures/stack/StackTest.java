package stack;

public class StackTest{
  
    public static void main(String[] args) {
     Stack stack =  new Stack();
     stack.push(1);
     System.out.println(stack.pop());


     StackUsingArrayList stackUsingArrayList = new StackUsingArrayList();
     stackUsingArrayList.push(10);
     System.out.println(stackUsingArrayList.peek());
     System.out.println(stackUsingArrayList.pop());
     System.out.println(stackUsingArrayList.peek());

    }
}