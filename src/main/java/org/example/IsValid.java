package org.example;

import java.util.Collections;
import java.util.Stack;

public class IsValid {

    private Stack<Character> stack = new Stack<>();

    public boolean isValid(String s) {

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals('(') || c.equals('[') || c.equals('{')) {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                Character top = stack.peek();

                if (c.equals(')') && top.equals('(')) {
                    stack.pop();
                } else if (c.equals(']') && top.equals('[')) {
                    stack.pop();
                } else if (c.equals('}') && top.equals('{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        } else {
            return true;
        }

    }
}
