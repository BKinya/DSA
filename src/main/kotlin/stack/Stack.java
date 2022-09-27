package stack;

import java.util.ArrayList;

public class Stack {
    public ArrayList<Integer> stack;
    public Stack(ArrayList<Integer> numStack){
        stack = numStack;
    }

    public void push(int num){
        stack.add(num);
    }

    public int pop(){
        int n = getSize();
        int old = stack.get(n-1);
        stack.remove(n-1);
        return old;
    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public int peek(){
        int n = getSize();
        int top = -1;
        if (!isEmpty()){
            top = stack.get(n-1);
        }
        return top;
    }
    public int getSize(){
        return stack.size();
    }
}
