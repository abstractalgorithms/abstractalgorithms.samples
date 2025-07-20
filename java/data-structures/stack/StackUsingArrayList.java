package stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    private ArrayList<Integer> items = new ArrayList();

    public void push(Integer item){
        items.add(item);
    }

    public Integer pop(){
        return items.size() != 0 ? items.remove(items.size() - 1) : -1;
    }

    public Integer peek(){
        return items.size() != 0 ? items.get(items.size() - 1) : -1;
    }
}
