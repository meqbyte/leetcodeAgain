package org.example;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();


    public MinStack() {

    }

    public void push(int val) {
        stack.push(val);

        if (minStack.empty()) {
            minStack.push(val);
        } else {
            int t = minStack.peek();
            int min = Math.min(val, t);
            minStack.push(min);
        }

    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {

        return minStack.peek();
    }
}
