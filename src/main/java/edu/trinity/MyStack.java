package edu.trinity;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> {
    private ArrayList<T> arr;
    private int top;

    public MyStack() {
        arr = new ArrayList<T>();
        this.top = -1;
    }
    public void push(T hello) {
        if (top + 1 == Integer.MAX_VALUE) System.out.println("Stack Overflow");
        else {
            top++;
            if(arr.size() > top) arr.set(top, hello);
            else arr.add(hello);
        }
    }

    public T peek() {
        if(top == -1) return null;
        else return arr.get(top);
    }

    public T pop() {
        if (top == -1) throw new EmptyStackException();
        top--;
        return arr.get(top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public int getSize() {
        return (top + 1);
    }
}
