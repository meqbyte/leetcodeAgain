package org.example;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        inToOut();
        return outStack.pop();
    }

    public int peek() {
        inToOut();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.empty() && outStack.empty();
    }

    private void inToOut() {
        while (!inStack.empty()) {
            outStack.push(inStack.pop());
        }
    }

}
